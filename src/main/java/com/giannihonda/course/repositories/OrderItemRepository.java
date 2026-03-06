package com.giannihonda.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giannihonda.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
