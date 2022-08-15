package com.api.parkingcontrol.core.domain.mapper;

import com.api.parkingcontrol.core.database.model.ParkingSpotEntity;
import com.api.parkingcontrol.core.domain.parkingspot.ParkingSpot;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ParkingSpotMapper {
  ParkingSpotMapper INSTANCE = Mappers.getMapper(ParkingSpotMapper.class);

  ParkingSpotEntity mapper(ParkingSpot domain);

  ParkingSpot mapper(ParkingSpotEntity entity);
}
