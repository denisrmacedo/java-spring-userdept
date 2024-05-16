package com.denis.userdept.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.denis.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
