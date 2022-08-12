package com.api.parkingcontrol.core.usecase.car.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CarResponse {
  private String responsibleCpf;
  private String licensePlateCar;
  private String brandCar;
  private String modelCar;
  private String colorCar;
}
