package com.main.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {
	
	//Optional<StudentEntity> findByEmailIDAndPassword(String emailID, String passwordI);

}
