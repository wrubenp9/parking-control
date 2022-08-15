package com.api.parkingcontrol.core.usecase.parkingspot;

public interface ParkingSpotUseCase {
  void execute(String parkingSpotNumber, String licensePlate);
}
