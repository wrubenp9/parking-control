package com.api.parkingcontrol.core.usecase.parkingspot.model;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ParkingSpotCreateResponse {
  private String parkingSpotNumber;
  private Boolean status;
  private LocalDateTime checkIn;
  private LocalDateTime checkOut;
}
