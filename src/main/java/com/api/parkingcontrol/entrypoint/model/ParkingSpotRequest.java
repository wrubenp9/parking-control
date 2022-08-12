package com.api.parkingcontrol.entrypoint.model;

import javax.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ParkingSpotRequest {
  @NotBlank private String parkingSpotNumber;
  @NotBlank private String licensePlateCar;
}
