package com.api.parkingcontrol.core.domain.exception;

import com.api.parkingcontrol.core.usecase.exception.BusinessException;
import java.time.LocalDateTime;
import java.util.Set;
import javax.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerAdvice {

  @ExceptionHandler(BusinessException.class)
  public ResponseEntity<ExceptionResponse> businessException(
    BusinessException e, HttpServletRequest request) {

    var exception = e.getExceptionCodeEnum();

    var status = exception.getStatus();
    var statusMessage = exception.getStatus().getReasonPhrase();
    var statusCode = exception.getStatus().value();

    Set<Errors> errors =
      Set.of(Errors.builder().code(exception.getCode()).message(exception.getMessage()).build());

    ExceptionResponse exceptionCode =
      new ExceptionResponse(
        LocalDateTime.now(), statusCode, statusMessage, request.getRequestURI(), errors);

    return ResponseEntity.status(status).body(exceptionCode);
  }
}
