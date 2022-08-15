package com.api.parkingcontrol.core.usecase.user;

import com.api.parkingcontrol.core.database.repository.UserRepository;
import com.api.parkingcontrol.core.domain.exception.ExceptionCodeEnum;
import com.api.parkingcontrol.core.domain.mapper.UserMapper;
import com.api.parkingcontrol.core.usecase.user.model.UserCreateRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserCreateUseCaseImpl implements UserCreateUseCase {

  private final UserRepository userRepository;

  @Override
  public void execute(UserCreateRequest request) {

    if (Boolean.TRUE.equals(userRepository.existCPF(request.getCpf()))) {
      ExceptionCodeEnum.CPF_REGISTERED.throwException();
    }

    userRepository.save(UserMapper.INSTANCE.mapper(request));
  }
}
