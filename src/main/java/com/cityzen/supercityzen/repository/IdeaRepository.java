package com.cityzen.supercityzen.repository;

import com.cityzen.supercityzen.entity.Idea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IdeaRepository extends JpaRepository<Idea, Long> {
}
