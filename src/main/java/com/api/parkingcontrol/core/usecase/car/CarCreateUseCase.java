package com.api.parkingcontrol.core.usecase.car;

import com.api.parkingcontrol.core.usecase.car.model.CarCreateRequest;

public interface CarCreateUseCase {
  void execute(CarCreateRequest request);
}
