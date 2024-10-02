package com.cityzen.supercityzen.repository;

import com.cityzen.supercityzen.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
