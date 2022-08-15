package com.api.parkingcontrol.core.usecase.parkingspot;

import com.api.parkingcontrol.core.database.repository.CarRepository;
import com.api.parkingcontrol.core.database.repository.ParkingSpotRepository;
import com.api.parkingcontrol.core.domain.car.Car;
import com.api.parkingcontrol.core.domain.mapper.CarMapper;
import com.api.parkingcontrol.core.domain.mapper.ParkingSpotMapper;
import com.api.parkingcontrol.core.domain.parkingspot.ParkingSpot;

import java.time.LocalDateTime;
import javax.transaction.Transactional;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ParkingSpotCreateUseCaseImpl implements ParkingSpotCreateUseCase {

  private final ParkingSpotRepository parkingSpotRepository;
  private final CarRepository carRepository;

  @Override
  @Transactional
  public void execute(String parkingSpotNumber, String licensePlate) {

      ParkingSpot parkingSpot =
        ParkingSpot.builder()
          .parkingSpotNumber(parkingSpotNumber)
          .build();

      parkingSpotRepository.save(ParkingSpotMapper.INSTANCE.mapper(parkingSpot));
  }
}
