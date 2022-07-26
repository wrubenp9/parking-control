package com.api.parkingcontrol.core.domain.user;

import com.api.parkingcontrol.core.domain.car.Car;
import java.time.LocalDateTime;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
  private UUID id;
  private String name;
  private String email;
  private String cpf;
  private String apartment;
  private String block;
  private LocalDateTime createdAt;

  public static Car mapper(Object object) {
    var result = Car.builder().build();
    BeanUtils.copyProperties(object, result);
    return result;
  }
}
