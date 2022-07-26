package com.api.parkingcontrol.core.usecase.car;

import com.api.parkingcontrol.core.database.model.CarEntity;
import com.api.parkingcontrol.core.database.repository.CarRepository;
import com.api.parkingcontrol.core.database.repository.UserRepository;
import com.api.parkingcontrol.core.domain.exception.ExceptionCodeEnum;
import com.api.parkingcontrol.core.usecase.car.model.CarCreateRequest;

import javax.transaction.Transactional;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CarCreateUseCaseImpl implements CarCreateUseCase {

  private final CarRepository carRepository;
  private final UserRepository userRepository;

  @Override
  @Transactional
  public void execute(CarCreateRequest request) {
    var user = userRepository.findByCpf(request.getResponsibleCpf());
    var car = carRepository.findByLicensePlateCar(request.getLicensePlateCar());

    if (user.isPresent() && car.isEmpty()) {
      var userEntity = user.get();

      var carEntity =
        CarEntity.builder()
          .licensePlateCar(request.getLicensePlateCar())
          .brandCar(request.getBrandCar())
          .colorCar(request.getColorCar())
          .modelCar(request.getModelCar())
          .user(userEntity)
          .build();

      carRepository.save(carEntity);
    } else {
      ExceptionCodeEnum.VALUE_UNIQUE_DUPLICATE.throwException();
    }
  }
}
