package com.rms.rentsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rms.rentsystem.dto.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

}
