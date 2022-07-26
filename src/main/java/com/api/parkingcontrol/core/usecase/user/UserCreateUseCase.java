package com.api.parkingcontrol.core.usecase.user;

import com.api.parkingcontrol.core.usecase.user.model.UserCreateRequest;

public interface UserCreateUseCase {
  void execute(UserCreateRequest request);
}
