package com.api.parkingcontrol.core.usecase.parkingspot;

public interface ParkingSpotCreateUseCase {
  void execute(String parkingSpotNumber, String licensePlateCar);
}
