package com.api.parkingcontrol.core.domain.mapper;

import com.api.parkingcontrol.core.database.model.UserEntity;
import com.api.parkingcontrol.core.domain.user.User;
import com.api.parkingcontrol.core.usecase.user.model.UserCreateRequest;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {
  UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

  UserEntity mapper(User domain);

  UserEntity mapper(UserCreateRequest request);

  User mapper(UserEntity entity);
}
