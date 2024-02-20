package com.main.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.coyote.RequestInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.main.dao.StudentRepository;
import com.main.dto.StudentDTO;
import com.main.entity.StudentEntity;



@Service
@Transactional
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	StudentRepository studentRepository;

	@Override
	public List<StudentDTO> FetchAllStudents() {
		List<StudentEntity>  listOfStudentEntities=studentRepository.findAll();
		List<StudentDTO> dtoList=new ArrayList<>();
		
		for( StudentEntity  studentEntity:listOfStudentEntities ){
			StudentDTO studentDTO =new StudentDTO();
			BeanUtils.copyProperties(studentEntity,studentDTO);
			dtoList.add(studentDTO);
			
			
		}
		return dtoList;
	}
	
	@Override
	public void saveStudent(StudentDTO studentDTO) {
		StudentEntity studentEntity=new StudentEntity();
		BeanUtils.copyProperties(studentDTO, studentEntity);
		studentRepository.save(studentEntity);
		
	}

	@Override
	public void deleteStudent(int StudentSSN) {
		studentRepository.deleteById(StudentSSN);;
		
	}

	@Override
	public StudentDTO requestInfo(int studentSSN) {		
		Optional<StudentEntity> optStudentEntity = studentRepository.findById(studentSSN);
		StudentEntity studentEntity = optStudentEntity.get();
		
		StudentDTO studentDTO = new StudentDTO();
		BeanUtils.copyProperties(studentEntity, studentDTO);
		return studentDTO;
	}
	
	@Override
	public void editStudent(StudentDTO studentDTO) {
		StudentEntity studentEntity=new StudentEntity();
		BeanUtils.copyProperties(studentDTO, studentEntity);
		studentRepository.save(studentEntity);
		
	}
	
}

	

	

	



