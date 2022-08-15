package com.api.parkingcontrol.core.domain.user;

import java.time.LocalDateTime;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
  private UUID id;
  private String name;
  private String cpf;
  private LocalDateTime createdAt;
}
