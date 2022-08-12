package com.api.parkingcontrol.core.usecase.parkingspot;

import com.api.parkingcontrol.core.database.model.ParkingSpotEntity;
import com.api.parkingcontrol.core.database.repository.CarRepository;
import com.api.parkingcontrol.core.database.repository.ParkingSpotRepository;
import com.api.parkingcontrol.core.domain.car.Car;
import com.api.parkingcontrol.core.domain.parkingspot.ParkingSpot;
import java.time.LocalDateTime;
import java.util.Set;
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
  public void execute(String parkingSpotNumber, String licensePlateCar) {
    var car = carRepository.findByLicensePlateCar(licensePlateCar);

    //TO-DO : work in progress
//    if (car.isPresent()) {
//      var carEntity = car.get();
//
//      ParkingSpot parkingSpot = new ParkingSpot();
//
//      parkingSpot.setParkingSpotNumber(parkingSpotNumber);
//      parkingSpot.setStatus(true);
//      parkingSpot.setCheckIn(LocalDateTime.now());
//      parkingSpot.getCar().add(Car.mapper(carEntity));
//
//      parkingSpotRepository.save(ParkingSpotEntity.mapper(parkingSpot));
//    }
  }
}
