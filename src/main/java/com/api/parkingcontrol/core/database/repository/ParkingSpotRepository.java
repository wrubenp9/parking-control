package com.api.parkingcontrol.core.database.repository;

import com.api.parkingcontrol.core.database.model.ParkingSpotEntity;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotEntity, UUID> {}
