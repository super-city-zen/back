package com.cityzen.supercityzen.service;

import com.cityzen.supercityzen.entity.Identifier;
import com.cityzen.supercityzen.entity.User;
import com.cityzen.supercityzen.repository.IdentifierRepository;
import com.cityzen.supercityzen.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    private final UserRepository userRepository;
    private final IdentifierRepository identifierRepository;

    public AuthenticationService(UserRepository userRepository, IdentifierRepository identifierRepository) {
        this.userRepository = userRepository;
        this.identifierRepository = identifierRepository;
    }
    public void setIdentifierUsed(Identifier identifier) {
        identifier.setUsed(true);
        identifierRepository.save(identifier);
    }
    public ResponseEntity<String> register(User user) {
        Identifier identifier = user.getIdentifier();
        Identifier identifierBDD = identifierRepository.findByLogin(identifier.getLogin());

        if (identifierBDD != null && identifierBDD.isUsed()) {
            return ResponseEntity.status(HttpStatus.IM_USED).body("Identifiant invalide");
        } else if (identifierBDD != null) {
            userRepository.save(user);
            identifierBDD.setUsed(true);
            identifierRepository.save(identifierBDD);
            return ResponseEntity.ok("L'utilisateur a bien été inscrit");
        }

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erreur lors de l'inscription, veuillez réessayer");
    }

    public User login(Identifier identifier, String password) {

        return null;
    }
}
