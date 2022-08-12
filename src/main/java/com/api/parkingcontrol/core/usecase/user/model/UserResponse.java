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
public class UserResponse {
  private String name;

  public static UserResponse mapper(Object object) {
    var result = UserResponse.builder().build();
    BeanUtils.copyProperties(object, result);
    return result;
  }
}
