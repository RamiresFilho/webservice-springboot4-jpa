package com.rftech.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rftech.webservice.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
