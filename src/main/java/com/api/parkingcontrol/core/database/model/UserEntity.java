package com.api.parkingcontrol.core.database.model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import javax.persistence.*;
import javax.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.beans.BeanUtils;

@Entity(name = "user")
@Table(name = "tb_user")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID id;

  @Column(name = "name", nullable = false)
  private String name;

  @Column(nullable = false, unique = true)
  @Email
  private String email;

  @Column(nullable = false, unique = true)
  @CPF
  private String cpf;

  @Column(nullable = false)
  @CreationTimestamp
  private LocalDateTime createdAt;

  @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
  private List<CarEntity> car;

  public static UserEntity mapper(Object object) {
    var result = UserEntity.builder().build();
    BeanUtils.copyProperties(object, result);
    return result;
  }
}
