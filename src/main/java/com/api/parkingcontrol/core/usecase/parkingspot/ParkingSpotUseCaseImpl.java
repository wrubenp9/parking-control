package com.api.parkingcontrol.core.usecase.parkingspot;

import com.api.parkingcontrol.core.database.repository.CarRepository;
import com.api.parkingcontrol.core.database.repository.ParkingSpotRepository;
import com.api.parkingcontrol.core.domain.mapper.ParkingSpotMapper;
import com.api.parkingcontrol.core.domain.parkingspot.ParkingSpot;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class ParkingSpotUseCaseImpl implements ParkingSpotUseCase {

  private final ParkingSpotRepository parkingSpotRepository;
  private final CarRepository carRepository;

  @Override
  public void execute(String parkingSpotNumber, String licensePlate) {

    var carOp = carRepository.findByLicensePlate(licensePlate);

    var parkingSpotPresent = parkingSpotRepository.findParkingSpotByParkingSpotNumber(parkingSpotNumber);

    if (parkingSpotPresent.isPresent()) {
      var parkingSpot = parkingSpotPresent.get();

      if (carOp.isPresent()) {
        var car = carOp.get();

        car.getParkingSpot().add(parkingSpot);
        parkingSpot.getCar().add(car);
        parkingSpotRepository.save(parkingSpot);
      }
    }
  }
}
