package com.giannihonda.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giannihonda.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
