package com.phearun.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.phearun.hibernate.entity.User;
import com.phearun.repository.UserRepository;

@Controller
public class UserControll {
    
    @Autowired
    private UserRepository userRepository;
    
    @RequestMapping("/")
    @ResponseBody public Collection<User> findAll(){
    	return userRepository.getAll();
    }
    
    @RequestMapping("/save")
    @ResponseBody public boolean save(){
    	User user = new User();
    	user.setUsername("test");
    	user.setPassword("123");
    	userRepository.add(user);
    	return true;
    }
    
}
