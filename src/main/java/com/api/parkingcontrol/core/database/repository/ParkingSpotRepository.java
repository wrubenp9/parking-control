package com.api.parkingcontrol.core.database.repository;

import com.api.parkingcontrol.core.database.model.ParkingSpotEntity;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotEntity, UUID> {

  Optional<ParkingSpotEntity> findParkingSpotByParkingSpotNumber(String parkingSpotNumber);

  //  @Query("SELECT parkingSpotNumber FROM car WHERE status = ?1")
  //  List<ParkingSpotEntity> findParkingSpotByStatus(Boolean status);
}
