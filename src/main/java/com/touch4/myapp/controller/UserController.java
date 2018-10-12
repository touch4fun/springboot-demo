package com.touch4.myapp.controller;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.touch4.myapp.dao.UserDao;
import com.touch4.myapp.domain.User;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserDao userDao;
	
	@RequestMapping("login")
	public void login() {
		
	}
	
	@GetMapping("/list")
	public List<User> list(User user,Pageable pageable) {
		Example<User> example = Example.of(user); 
		Page<User> page = userDao.findAll(example,pageable);
		return page.getContent();
	}
	
	@GetMapping("/{id}")
	public User getById(@PathVariable("id") Integer id) {
		Optional<User> user = userDao.findById(id);
		return user.get();
	}
	@PostMapping("")
	public User add(User user) {
		
		return userDao.save(user);
	}
	@PutMapping("")
	public User update(User user) {
		
		return userDao.save(user);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Integer id) {
		userDao.deleteById(id);
	}
}
