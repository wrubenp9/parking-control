package com.api.parkingcontrol.core.database.repository;

import com.api.parkingcontrol.core.database.model.UserEntity;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, UUID> {

  Optional<UserEntity> findByCpf(String cpf);
  //  @Query("SELECT cpf  FROM user WHERE cpf = ?1")
  @Query("SELECT CASE WHEN (COUNT(cpf)>0) THEN true ELSE false END FROM user WHERE cpf = ?1 ")
  Boolean existCPF(String cpf);
}
