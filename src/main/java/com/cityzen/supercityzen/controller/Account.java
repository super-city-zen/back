package com.cityzen.supercityzen.controller;

import com.cityzen.supercityzen.entity.Identifier;
import com.cityzen.supercityzen.entity.User;
import com.cityzen.supercityzen.service.AuthenticationService;
import com.cityzen.supercityzen.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class Account {

    private final AuthenticationService authenticationService;
    // Inscription
    public Account(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping("/register")
    public ResponseEntity<String> inscription(@Valid @RequestBody User user) {
       return authenticationService.register(user);
    }

    // Connexion

    // Profil
    @GetMapping("/profil")
    public void profil(){

    }
}
