package com.touch4.myapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.touch4.myapp.domain.User;

public interface UserDao extends JpaRepository<User	, Integer>{

	
	
}
