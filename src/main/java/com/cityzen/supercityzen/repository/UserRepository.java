package com.cityzen.supercityzen.repository;

import com.cityzen.supercityzen.entity.Identifier;
import com.cityzen.supercityzen.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User getUserByIdentifier(Identifier identifier);
}
