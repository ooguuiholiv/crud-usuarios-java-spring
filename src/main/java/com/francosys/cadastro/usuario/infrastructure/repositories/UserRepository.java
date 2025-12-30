package com.francosys.cadastro.usuario.infrastructure.repositories;

import com.francosys.cadastro.usuario.infrastructure.entities.UserEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    Optional<UserEntity> findByEmail(String email);

    @Transactional
    void deleteByEmail(String email);
}
