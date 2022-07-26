package com.api.parkingcontrol.core.domain.exception;

import com.api.parkingcontrol.core.usecase.exception.ExceptionCode;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ExceptionCodeEnum {
  VALUE_UNIQUE_DUPLICATE("Value Unique duplicate.", HttpStatus.UNPROCESSABLE_ENTITY),
  INTERNAL_SERVER_ERROR("Value Unique duplicate.", HttpStatus.INTERNAL_SERVER_ERROR);

  private final String message;
  private final HttpStatus status;

  ExceptionCodeEnum(String message, HttpStatus status) {
    this.message = message;
    this.status = status;
  }

  // criar metodo static
  public void throwException() {
    throw new ExceptionCode(this);
  }
}
