package com.api.parkingcontrol.entrypoint.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {
  private String name;
  private String apartment;
  private String block;
  //  private CarResponse car;
}
