package com.cityzen.supercityzen.repository;

import com.cityzen.supercityzen.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project,Long> {
}
