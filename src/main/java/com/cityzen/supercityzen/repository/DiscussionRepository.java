package com.cityzen.supercityzen.repository;

import com.cityzen.supercityzen.entity.Discussion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiscussionRepository extends JpaRepository<Discussion, Long> {
}
