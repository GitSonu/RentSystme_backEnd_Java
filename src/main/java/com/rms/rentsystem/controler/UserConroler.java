package com.rms.rentsystem.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rms.rentsystem.dto.UserEntity;
import com.rms.rentsystem.service.UserService;

@RestController
@RequestMapping("api/rent")
public class UserConroler {

	
	@Autowired
	UserService userService;
	
	@PostMapping("save")
	public ResponseEntity<UserEntity> save(@RequestBody UserEntity user) {
		System.out.println("calling ");
		return ResponseEntity.ok(userService.save(user));
	}
	
	
	
	
	
}
