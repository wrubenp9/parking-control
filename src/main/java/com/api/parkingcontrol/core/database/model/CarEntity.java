package com.api.parkingcontrol.core.database.model;

import java.util.Set;
import java.util.UUID;
import javax.persistence.*;
import lombok.*;

@Entity(name = "car")
@Table(name = "tb_car")
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CarEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID id;

  @Column(nullable = false, unique = true, length = 7)
  private String licensePlate;

  @Column(nullable = false, length = 70)
  private String brand;

  @Column(nullable = false, length = 70)
  private String model;

  @Column(nullable = false, length = 70)
  private String color;

  @ManyToOne
  @JoinColumn(nullable = false)
  private UserEntity user;

  @ManyToMany(mappedBy = "car")
  private Set<ParkingSpotEntity> parkingSpot;

//  @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//  @JoinTable(
//      joinColumns = {@JoinColumn(name = "car_id")},
//      inverseJoinColumns = {@JoinColumn(name = "parking_spot_id")})
//  private Set<ParkingSpotEntity> parkingSpot;
}
