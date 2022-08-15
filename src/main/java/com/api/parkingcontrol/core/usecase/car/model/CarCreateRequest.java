package com.api.parkingcontrol.core.usecase.car.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CarCreateRequest {
  private String responsibleCpf;
  private String licensePlate;
  private String brand;
  private String model;
  private String color;
}
