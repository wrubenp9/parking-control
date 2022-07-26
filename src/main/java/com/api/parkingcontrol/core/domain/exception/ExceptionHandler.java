package com.api.parkingcontrol.core.domain.exception;

import com.api.parkingcontrol.core.usecase.exception.ExceptionCode;
import java.time.LocalDateTime;
import java.util.Set;
import javax.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionHandler {

  @org.springframework.web.bind.annotation.ExceptionHandler(ExceptionCode.class)
  public ResponseEntity<ExceptionResponse> exceptionHandler(
      ExceptionCode e, HttpServletRequest request) {

    var exception = e.getExceptionCodeEnum();

    var status = exception.getStatus();
    var statusMessage = exception.getStatus().getReasonPhrase();
    var statusCode = exception.getStatus().value();

    Set<Errors> errors = Set.of(Errors.builder().message(exception.getMessage()).build());

    ExceptionResponse exceptionCode =
        new ExceptionResponse(
            LocalDateTime.now(), statusCode, statusMessage, request.getRequestURI(), errors);
    return ResponseEntity.status(status).body(exceptionCode);
  }

  public ResponseEntity<ExceptionGenericResponse> internalServerError2(HttpServletRequest request) {

    var exception = ExceptionCodeEnum.INTERNAL_SERVER_ERROR;

    var status = exception.getStatus();
    var statusMessage = exception.getStatus().getReasonPhrase();
    var statusCode = exception.getStatus().value();

    ExceptionGenericResponse exceptionCode =
        new ExceptionGenericResponse(
            LocalDateTime.now(), statusCode, statusMessage, request.getRequestURI());
    return ResponseEntity.status(status).body(exceptionCode);
  }
}
