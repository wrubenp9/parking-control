package com.api.parkingcontrol.core.usecase.car.model;

import com.api.parkingcontrol.core.usecase.user.model.UserCreateRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CarCreateRequest {
  private String licensePlateCar;
  private String brandCar;
  private String modelCar;
  private String colorCar;
  private UserCreateRequest user;
}
