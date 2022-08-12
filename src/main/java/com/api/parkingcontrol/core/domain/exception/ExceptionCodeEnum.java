package com.api.parkingcontrol.core.domain.exception;

import com.api.parkingcontrol.core.usecase.exception.BusinessException;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ExceptionCodeEnum {
  FIELD_NULL(1000, "Field data is null.", HttpStatus.INTERNAL_SERVER_ERROR),
  CPF_INVALID(10001, "CPF invalid.", HttpStatus.BAD_REQUEST),
  CPF_REGISTERED(10010, "CPF already registered.", HttpStatus.UNPROCESSABLE_ENTITY),
  CAR_REGISTERED(10012, "car already registered.", HttpStatus.UNPROCESSABLE_ENTITY);

  private final int code;
  private final String message;
  private final HttpStatus status;

  ExceptionCodeEnum(int code, String message, HttpStatus status) {
    this.code = code;
    this.message = message;
    this.status = status;
  }

  public void throwException() {
    throw new BusinessException(this);
  }
}
