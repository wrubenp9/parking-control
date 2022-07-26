package com.api.parkingcontrol.entrypoint.model;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ParkingSpotResponse {
  private String parkingSpotNumber;
  private Boolean status;
  private LocalDateTime checkIn;
  private LocalDateTime checkOut;
}
