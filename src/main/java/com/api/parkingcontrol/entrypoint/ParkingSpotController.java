package com.api.parkingcontrol.entrypoint;

import com.api.parkingcontrol.core.database.repository.CarRepository;
import com.api.parkingcontrol.core.database.repository.UserRepository;
import com.api.parkingcontrol.core.usecase.car.CarCreateUseCase;
import com.api.parkingcontrol.core.usecase.parkingspot.ParkingSpotUseCase;
import com.api.parkingcontrol.core.usecase.user.UserCreateUseCase;
import com.api.parkingcontrol.entrypoint.mapper.CarRequestMapper;
import com.api.parkingcontrol.entrypoint.mapper.UserRequestMapper;
import com.api.parkingcontrol.entrypoint.model.CarRequest;

import javax.validation.Valid;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/parking-spot")
@RequiredArgsConstructor
public class ParkingSpotController {
  private final ParkingSpotUseCase parkingSpotUseCase;
  private final CarCreateUseCase carCreateUseCase;
  private final UserCreateUseCase userCreateUseCase;

  private final UserRepository userRepository;
  private final CarRepository carRepository;

  @PostMapping("/create/car")
  @ResponseStatus(HttpStatus.CREATED)
  public void createCar(@RequestBody @Valid CarRequest request) {
    var user = userRepository.findByCpf(request.getUser().getCpf());
    var car = carRepository.findByLicensePlateCar(request.getLicensePlateCar());

    if (car.isEmpty() && user.isEmpty()) {
      userCreateUseCase.execute(UserRequestMapper.INSTANCE.mapToDomain(request.getUser()));
      carCreateUseCase.execute(CarRequestMapper.INSTANCE.mapToDomain(request));
    } else if (user.isPresent()) {
      carCreateUseCase.execute(CarRequestMapper.INSTANCE.mapToDomain(request));
    }
  }
}
