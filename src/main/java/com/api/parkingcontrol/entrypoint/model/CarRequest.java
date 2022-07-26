package com.api.parkingcontrol.entrypoint.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CarRequest {
  private String responsibleCpf;
  private String licensePlateCar;
  private String brandCar;
  private String modelCar;
  private String colorCar;
}
