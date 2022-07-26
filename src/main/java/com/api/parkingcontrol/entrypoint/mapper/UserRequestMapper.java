package com.api.parkingcontrol.entrypoint.mapper;

import com.api.parkingcontrol.core.usecase.user.model.UserCreateRequest;
import com.api.parkingcontrol.entrypoint.model.UserRequest;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserRequestMapper {

  UserRequestMapper INSTANCE = Mappers.getMapper(UserRequestMapper.class);

  UserCreateRequest mapToDomain(UserRequest request);
}
