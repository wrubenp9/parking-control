package com.api.parkingcontrol.core.usecase.user.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserCreateResponse {
  private String name;
  private String apartment;
  private String block;

  public static UserCreateResponse mapper(Object object) {
    var result = UserCreateResponse.builder().build();
    BeanUtils.copyProperties(object, result);
    return result;
  }
}
