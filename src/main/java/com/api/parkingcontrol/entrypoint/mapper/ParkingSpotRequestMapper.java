package com.api.parkingcontrol.entrypoint.mapper;

import com.api.parkingcontrol.core.usecase.parkingspot.model.ParkingSpotCreateRequest;
import com.api.parkingcontrol.entrypoint.model.ParkingSpotRequest;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ParkingSpotRequestMapper {

  ParkingSpotRequestMapper INSTANCE = Mappers.getMapper(ParkingSpotRequestMapper.class);

  ParkingSpotCreateRequest mapToDomain(ParkingSpotRequest request);
}
