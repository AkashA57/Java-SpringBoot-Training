package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public EmployeeEntity authenticate(String emailId, String password) {
		EmployeeEntity employeeEntity = null;
		
		String sql = "select * from Employee where EmailId = ? and Password = ?";
		Object[] data = {emailId, password};
		
		try {
			employeeEntity = jdbcTemplate.queryForObject(sql, data, new BeanPropertyRowMapper<>(EmployeeEntity.class));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return employeeEntity;
	}

}
