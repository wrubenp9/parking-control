package com.api.parkingcontrol.entrypoint.mapper;

import com.api.parkingcontrol.core.usecase.car.model.CarCreateRequest;
import com.api.parkingcontrol.entrypoint.model.CarRequest;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CarRequestMapper {
  CarRequestMapper INSTANCE = Mappers.getMapper(CarRequestMapper.class);

  CarCreateRequest mapToDomain(CarRequest request);
}
