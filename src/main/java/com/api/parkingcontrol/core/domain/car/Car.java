package com.api.parkingcontrol.core.domain.car;

import com.api.parkingcontrol.core.domain.parkingspot.ParkingSpot;
import com.api.parkingcontrol.core.domain.user.User;
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
public class Car {
  private UUID id;
  private String licensePlate;
  private String brand;
  private String model;
  private String color;
  private User user;
  private Set<ParkingSpot> parkingSpot;
}
