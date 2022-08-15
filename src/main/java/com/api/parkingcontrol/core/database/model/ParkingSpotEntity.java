package com.api.parkingcontrol.core.database.model;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;
import javax.persistence.*;
import lombok.*;

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

  @Column(name = "status")
  private Boolean status;

  @Column(name = "check_in")
  private LocalDateTime checkIn;

  @Column(name = "check_out")
  private LocalDateTime checkOut;

  @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  @JoinTable(
    joinColumns = {@JoinColumn(name = "parking_spot_id")},
    inverseJoinColumns = {@JoinColumn(name = "car_id")})
  private Set<CarEntity> car;

//  @ManyToMany(mappedBy = "parkingSpot")
//  private Set<CarEntity> car;
}
