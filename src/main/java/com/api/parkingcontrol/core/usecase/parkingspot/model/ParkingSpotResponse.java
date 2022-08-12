package com.api.parkingcontrol.core.usecase.parkingspot.model;

import com.api.parkingcontrol.core.usecase.car.model.CarResponse;
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
  private CarResponse car;
}
