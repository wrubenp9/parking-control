package com.api.parkingcontrol.core.domain.exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDateTime;
import java.util.Set;
import lombok.Data;

@Data
public class ExceptionResponse {
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
  private LocalDateTime dateTime;

  private int statusCode;
  private String statusMessage;
  private String path;
  private Set<Errors> errors;

  public ExceptionResponse(
      LocalDateTime dateTime,
      int statusCode,
      String statusMessage,
      String path,
      Set<Errors> errors) {
    this.dateTime = dateTime;
    this.statusCode = statusCode;
    this.statusMessage = statusMessage;
    this.path = path;
    this.errors = errors;
  }
}
