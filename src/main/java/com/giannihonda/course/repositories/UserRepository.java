package com.giannihonda.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giannihonda.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
