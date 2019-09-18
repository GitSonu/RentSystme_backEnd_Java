package com.rms.rentsystem.service;

import java.util.List;

import com.rms.rentsystem.dto.UserEntity;

public interface UserService {

	public UserEntity save(UserEntity user);
	
	public UserEntity getUserbyId(Integer userId);
	
	public List<UserEntity> getAllUser();
	
	
}
