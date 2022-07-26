package com.api.parkingcontrol.core.usecase.exception;

import com.api.parkingcontrol.core.domain.exception.ExceptionCodeEnum;
import lombok.Getter;

@Getter
public class ExceptionCode extends RuntimeException {

  private final ExceptionCodeEnum exceptionCodeEnum;

  public ExceptionCode(ExceptionCodeEnum exception) {
    this.exceptionCodeEnum = exception;
  }
}
