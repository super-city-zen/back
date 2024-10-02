package com.cityzen.supercityzen.repository;

import com.cityzen.supercityzen.entity.Identifier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IdentifierRepository extends JpaRepository<Identifier, Long> {
}
