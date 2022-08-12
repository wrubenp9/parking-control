package com.api.parkingcontrol.core.domain.parkingspot;

import com.api.parkingcontrol.core.domain.car.Car;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ParkingSpot {
  private UUID id;
  private String parkingSpotNumber;
  private Boolean status;
  private LocalDateTime checkIn;
  private LocalDateTime checkOut;
  private Set<Car> car;
}
