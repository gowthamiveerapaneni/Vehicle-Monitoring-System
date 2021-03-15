package com.vehicles.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vehicles.springboot.model.User;



public interface UserRepository extends JpaRepository<User, Long>{

}
