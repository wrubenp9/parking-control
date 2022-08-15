package com.api.parkingcontrol.core.usecase.parkingspot.model;

import java.time.LocalDateTime;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ParkingSpotResponse {
  private UUID registerNumber;
  private String parkingSpotNumber;
  private Boolean status;
  private LocalDateTime checkIn;
  private LocalDateTime checkOut;
}
