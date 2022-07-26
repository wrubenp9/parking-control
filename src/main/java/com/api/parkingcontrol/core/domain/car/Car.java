package com.api.parkingcontrol.core.domain.car;

import com.api.parkingcontrol.core.domain.user.User;
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
public class Car {
  private UUID id;
  private String licensePlateCar;
  private String brandCar;
  private String modelCar;
  private String colorCar;
  private User user;

  public static Car mapper(Object object) {
    var result = Car.builder().build();
    BeanUtils.copyProperties(object, result);
    return result;
  }
}
