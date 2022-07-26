package com.api.parkingcontrol.entrypoint.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ParkingSpotResponseMapper {
  ParkingSpotResponseMapper INSTANCE = Mappers.getMapper(ParkingSpotResponseMapper.class);

  //  ParkingSpotResponse map(ParkingSpotEntity result);
}
