package com.api.parkingcontrol.core.domain.exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDateTime;
import lombok.Data;

@Data
public class ExceptionGenericResponse {
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
  private LocalDateTime dateTime;

  private int statusCode;
  private String statusMessage;
  private String path;

  public ExceptionGenericResponse(
      LocalDateTime dateTime, int statusCode, String statusMessage, String path) {
    this.dateTime = dateTime;
    this.statusCode = statusCode;
    this.statusMessage = statusMessage;
    this.path = path;
  }
}
