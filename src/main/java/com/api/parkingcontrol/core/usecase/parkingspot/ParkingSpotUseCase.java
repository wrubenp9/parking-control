package com.api.parkingcontrol.core.usecase.parkingspot;

import com.api.parkingcontrol.core.usecase.parkingspot.model.ParkingSpotCreateRequest;
import com.api.parkingcontrol.core.usecase.parkingspot.model.ParkingSpotCreateResponse;

public interface ParkingSpotUseCase {
  ParkingSpotCreateResponse save(ParkingSpotCreateRequest request);
}
