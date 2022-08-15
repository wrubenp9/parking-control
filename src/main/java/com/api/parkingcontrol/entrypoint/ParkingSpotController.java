package com.api.parkingcontrol.entrypoint;

import com.api.parkingcontrol.core.database.repository.ParkingSpotRepository;
import com.api.parkingcontrol.core.usecase.car.CarCreateUseCase;
import com.api.parkingcontrol.core.usecase.parkingspot.ParkingSpotCreateUseCase;
import com.api.parkingcontrol.core.usecase.parkingspot.ParkingSpotUseCase;
import com.api.parkingcontrol.core.usecase.user.UserCreateUseCase;
import com.api.parkingcontrol.entrypoint.mapper.CarRequestMapper;
import com.api.parkingcontrol.entrypoint.mapper.UserRequestMapper;
import com.api.parkingcontrol.entrypoint.model.CarRequest;
import com.api.parkingcontrol.entrypoint.model.UserRequest;

import javax.validation.Valid;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class ParkingSpotController {
  private final UserCreateUseCase userCreateUseCase;
  private final CarCreateUseCase carCreateUseCase;
  private final ParkingSpotUseCase parkingSpotUseCase;
  private final ParkingSpotCreateUseCase parkingSpotCreateUseCase;

  private final ParkingSpotRepository parkingSpotRepository;

  @PostMapping("/create/user")
  @ResponseStatus(HttpStatus.CREATED)
  public void createUser(@RequestBody @Valid UserRequest request) {
    userCreateUseCase.execute(UserRequestMapper.INSTANCE.mapToDomain(request));
  }

  @PostMapping("/create/car")
  @ResponseStatus(HttpStatus.CREATED)
  public void createCar(@RequestBody @Valid CarRequest request) {
    carCreateUseCase.execute(CarRequestMapper.INSTANCE.mapToDomain(request));
  }

  @PostMapping("/create/parking-spot")
  @ResponseStatus(HttpStatus.CREATED)
  public void createParkingSpot(
    @RequestParam String parkingSpotNumber, @RequestParam String licensePlate) {

//    var parkingSpot = parkingSpotRepository.findParkingSpotByParkingSpotNumber(parkingSpotNumber);

//    if (parkingSpot.isEmpty()) {
      parkingSpotCreateUseCase.execute(parkingSpotNumber, licensePlate);
//    } else {
//      parkingSpotUseCase.execute(parkingSpotNumber, licensePlate);
//    }
  }
}
