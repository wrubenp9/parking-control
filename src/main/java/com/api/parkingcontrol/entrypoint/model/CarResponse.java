package com.api.parkingcontrol.entrypoint.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CarResponse {
  private String licensePlate;
  private String brand;
  private String model;
  private String color;
  private UserResponse user;
}
