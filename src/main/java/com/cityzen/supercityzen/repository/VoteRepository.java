package com.cityzen.supercityzen.repository;

import com.cityzen.supercityzen.entity.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<Vote, Long> {
}
