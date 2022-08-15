package com.api.parkingcontrol.core.usecase.car;

import com.api.parkingcontrol.core.database.repository.CarRepository;
import com.api.parkingcontrol.core.database.repository.UserRepository;
import com.api.parkingcontrol.core.domain.car.Car;
import com.api.parkingcontrol.core.domain.exception.ExceptionCodeEnum;
import com.api.parkingcontrol.core.domain.mapper.CarMapper;
import com.api.parkingcontrol.core.domain.mapper.UserMapper;
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

    if (user.isPresent()) {
      var userEntity = user.get();

      var car =
          Car.builder()
              .licensePlate(request.getLicensePlate())
              .brand(request.getBrand())
              .color(request.getColor())
              .model(request.getModel())
              .user(UserMapper.INSTANCE.mapper(userEntity))
              .build();

      carRepository.save(CarMapper.INSTANCE.mapper(car));
    } else {
      if (user.isPresent()) {
        ExceptionCodeEnum.CPF_INVALID.throwException();
      } else {
        ExceptionCodeEnum.CAR_REGISTERED.throwException();
      }
    }
  }
}
