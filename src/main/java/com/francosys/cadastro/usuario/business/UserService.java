package com.francosys.cadastro.usuario.business;

import com.francosys.cadastro.usuario.infrastructure.entities.UserEntity;
import com.francosys.cadastro.usuario.infrastructure.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void save(UserEntity userEntity) {
        userRepository.saveAndFlush(userEntity);
    }

    // Buscar usuários por e-mail
    public UserEntity findUserByEmail(String email) {
        return userRepository.findByEmail(email).orElseThrow(
                () -> new RuntimeException("E-mail não encontrado!")
        );
    }

    public void deleteByEmail(String email) {
        userRepository.deleteByEmail(email);
    }

    public void updateUserById(Integer id, UserEntity user) {
        UserEntity userEntity = userRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Id inexistente!")
        );
        UserEntity userEntityUpdated = UserEntity.builder()
                .email(user.getEmail() != null ? user.getEmail() : userEntity.getEmail())
                .fullname(user.getFullname() != null ? user.getFullname() : userEntity.getFullname())
                .id(userEntity.getId())
                .build();

        userRepository.saveAndFlush(userEntityUpdated);
    }
}
