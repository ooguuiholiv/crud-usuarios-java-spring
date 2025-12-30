package com.francosys.cadastro.usuario.controller;


import com.francosys.cadastro.usuario.business.UserService;
import com.francosys.cadastro.usuario.infrastructure.entities.UserEntity;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor

public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<Void> saveUser(@RequestBody UserEntity user){
        userService.save(user);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public  ResponseEntity<UserEntity> findUserByEmail(@RequestParam String email){
        return ResponseEntity.ok(userService.findUserByEmail(email));
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteUserByEmail(@RequestParam String email){
        userService.deleteByEmail(email);
        return ResponseEntity.ok().build();
    }


    @PutMapping
    public ResponseEntity<Void> updateUserById(@RequestParam Integer id, @RequestBody UserEntity user){
        userService.updateUserById(id, user);
        return ResponseEntity.ok().build();
    }

}
