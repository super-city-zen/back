package com.cityzen.supercityzen.service;

import com.cityzen.supercityzen.entity.Identifier;
import com.cityzen.supercityzen.entity.User;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class UserService {
    Optional<User> getUserByIdentifier(Identifier identifier) {
        return null;
    }

    User updateUserByIdentifier(Identifier identifier, User user) {
        return null;
    }

    void deleteUserByIdentifier(Identifier identifier) {

    }
}
