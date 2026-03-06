package com.giannihonda.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giannihonda.course.entities.enums.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
