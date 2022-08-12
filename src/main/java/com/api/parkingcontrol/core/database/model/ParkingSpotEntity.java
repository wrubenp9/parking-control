package com.api.parkingcontrol.core.database.model;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;
import javax.persistence.*;
import lombok.*;
import org.springframework.beans.BeanUtils;

@Entity(name = "parking_spot")
@Table(name = "tb_parking_spot")
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ParkingSpotEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID id;

  @Column(name = "parking_spot_number", nullable = false, unique = true, length = 10)
  private String parkingSpotNumber;

  @Column(name = "status", nullable = false)
  private Boolean status;

  @Column(name = "check_in", nullable = false)
  private LocalDateTime checkIn;

  @Column(name = "check_out")
  private LocalDateTime checkOut;

  @ManyToMany
  @JoinTable(
      joinColumns = {@JoinColumn(name = "parking_spot_id")},
      inverseJoinColumns = {@JoinColumn(name = "car_id")})
  private Set<CarEntity> car;

  public static ParkingSpotEntity mapper(Object object) {
    var result = ParkingSpotEntity.builder().build();
    BeanUtils.copyProperties(object, result);
    return result;
  }
}
