package com.api.parkingcontrol.core.database.model;

import java.util.Set;
import java.util.UUID;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

@Entity(name = "car")
@Table(name = "tb_car")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CarEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID id;

  @Column(nullable = false, unique = true, length = 7)
  private String licensePlateCar;

  @Column(nullable = false, length = 70)
  private String brandCar;

  @Column(nullable = false, length = 70)
  private String modelCar;

  @Column(nullable = false, length = 70)
  private String colorCar;

  @ManyToOne
  @JoinColumn(nullable = false)
  private UserEntity user;

  @ManyToMany(mappedBy = "car")
  private Set<ParkingSpotEntity> parkingSpot;

  public static CarEntity mapper(Object object) {
    var result = CarEntity.builder().build();
    BeanUtils.copyProperties(object, result);
    return result;
  }
}
