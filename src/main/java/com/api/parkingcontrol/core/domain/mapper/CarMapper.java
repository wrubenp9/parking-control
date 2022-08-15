package com.api.parkingcontrol.core.domain.mapper;

import com.api.parkingcontrol.core.database.model.CarEntity;
import com.api.parkingcontrol.core.domain.car.Car;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CarMapper {
  CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

  CarEntity mapper(Car domain);

  Car mapper(CarEntity entity);
}
