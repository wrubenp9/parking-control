package com.api.parkingcontrol.core.database.repository;

import com.api.parkingcontrol.core.database.model.CarEntity;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<CarEntity, UUID> {
  Optional<CarEntity> findByLicensePlateCar(String licensePlateCar);
}
