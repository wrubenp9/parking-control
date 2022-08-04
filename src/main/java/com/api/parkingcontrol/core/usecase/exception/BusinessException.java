package com.api.parkingcontrol.core.usecase.exception;

import com.api.parkingcontrol.core.domain.exception.ExceptionCodeEnum;
import lombok.Getter;

@Getter
public class BusinessException extends RuntimeException {

  private final ExceptionCodeEnum exceptionCodeEnum;

  public BusinessException(ExceptionCodeEnum exception) {
    this.exceptionCodeEnum = exception;
  }
}
