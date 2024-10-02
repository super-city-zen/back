package com.cityzen.supercityzen.service;

import com.cityzen.supercityzen.entity.Identifier;
import com.cityzen.supercityzen.entity.User;
import com.cityzen.supercityzen.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    //Se servir du repo uniquement pour ce service
    private UserRepository userRepository;
    public static void setIdentifierUsed(Identifier identifier) {

    }

    public static User register(Identifier identifier, User user) {
        return null;
    }

    public static User login(Identifier identifier, String password) {
        return null;
    }
}
