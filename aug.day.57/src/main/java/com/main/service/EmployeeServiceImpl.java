package com.main.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.coyote.RequestInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.main.dao.EmployeeRepository;
import com.main.dto.EmployeeDTO;
import com.main.entity.EmployeeEntity;



@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public List<EmployeeDTO> FetchAllEmployees() {
		List<EmployeeEntity>  listOfEmpEntities=employeeRepository.findAll();
		List<EmployeeDTO> dtoList=new ArrayList<>();
		
		for( EmployeeEntity  employeeEntity:listOfEmpEntities ){
			EmployeeDTO employeeDTO =new EmployeeDTO();
			BeanUtils.copyProperties(employeeEntity, employeeDTO);
			dtoList.add(employeeDTO);
			
			
		}
		return dtoList;
	}
	
	@Override
	public void saveEmp(EmployeeDTO empDTO) {
		EmployeeEntity employeeEntity=new EmployeeEntity();
		BeanUtils.copyProperties(empDTO, employeeEntity);
		employeeRepository.save(employeeEntity);
		
	}

	@Override
	public void deleteEmp(int employeeID) {
		employeeRepository.deleteById(employeeID);
		
	}

	@Override
	public EmployeeDTO requestInfo(int employeeID) {		
		Optional<EmployeeEntity> optEmpEntity = employeeRepository.findById(employeeID);
		EmployeeEntity employeeEntity = optEmpEntity.get();
		
		EmployeeDTO employeeDTO = new EmployeeDTO();
		BeanUtils.copyProperties(employeeEntity, employeeDTO);
		return employeeDTO;
	}
	
	@Override
	public void editEmp(EmployeeDTO empDTO) {
		EmployeeEntity employeeEntity=new EmployeeEntity();
		BeanUtils.copyProperties(empDTO, employeeEntity);
		employeeRepository.save(employeeEntity);
		
	}
	
	@Override
	public EmployeeDTO authenticate(String email, String pswd) {
		
		Optional<EmployeeEntity> optEmpEntity = employeeRepository.findByEmailIDAndPassword(email, pswd);
		
		EmployeeDTO employeeDTO = null;
		if(optEmpEntity.isPresent()) {
			EmployeeEntity employeeEntity = optEmpEntity.get();
			employeeDTO = new EmployeeDTO();
			BeanUtils.copyProperties(employeeEntity, employeeDTO);
		}
		return employeeDTO;
	}

	

	

	


}
