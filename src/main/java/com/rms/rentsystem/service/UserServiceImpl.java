package com.rms.rentsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rms.rentsystem.dto.UserEntity;
import com.rms.rentsystem.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserEntity save(UserEntity user) {
		return userRepository.save(user);
	}

	@Override
	public UserEntity getUserbyId(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserEntity> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

}
