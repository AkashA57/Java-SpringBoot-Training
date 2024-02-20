package com.main.service;

import java.util.List;
import java.util.Optional;

import com.main.dto.StudentDTO;
import com.main.entity.StudentEntity;

public interface StudentService {
	
	List<StudentDTO> FetchAllStudents();
	
	void saveStudent(StudentDTO empDTO);
	
	void deleteStudent(int studentSSN);
	
	StudentDTO requestInfo(int studentSSN);
	
	void editStudent(StudentDTO studentDTO);

}
