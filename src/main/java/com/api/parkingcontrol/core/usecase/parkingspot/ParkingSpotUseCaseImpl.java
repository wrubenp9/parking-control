package com.api.parkingcontrol.core.usecase.parkingspot;

import com.api.parkingcontrol.core.database.repository.ParkingSpotRepository;
import com.api.parkingcontrol.core.usecase.parkingspot.model.ParkingSpotCreateRequest;
import com.api.parkingcontrol.core.usecase.parkingspot.model.ParkingSpotCreateResponse;
import javax.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ParkingSpotUseCaseImpl implements ParkingSpotUseCase {

  private final ParkingSpotRepository repository;

  @Override
  @Transactional
  public ParkingSpotCreateResponse save(ParkingSpotCreateRequest request) {
    return null;
  }
}
