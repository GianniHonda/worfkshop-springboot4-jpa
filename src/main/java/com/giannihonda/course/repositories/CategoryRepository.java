package com.giannihonda.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giannihonda.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
