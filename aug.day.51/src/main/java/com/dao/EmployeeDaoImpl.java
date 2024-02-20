
package com.dao;

import java.util.List;

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
			System.out.println("Email address in Employee Dao is: " + employeeEntity.getEmailID());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return employeeEntity;
	}

	@Override
	public List<EmployeeEntity> giveAllEmp() {
		 String sql="select * from employee ";
		 List<EmployeeEntity> e=(List)jdbcTemplate.query(sql, new BeanPropertyRowMapper(EmployeeEntity.class));
		return e;
	}

	@Override
	public void deleteEmp(int employeeID) {
		
		jdbcTemplate.update("delete from employee where employeeID= ?",employeeID);	
		
	}

	@Override
	public void saveEmp(EmployeeEntity employeeEntity) {
		System.out.println(employeeEntity.getEmployeeID());
		
		String sql="insert into Employee(Name,Salary,EmailId,Password)values(?,?,?,?)";
	    Object[] data={employeeEntity.getName(),employeeEntity.getSalary(),employeeEntity.getEmailID(),employeeEntity.getPassword()};
	    jdbcTemplate.update(sql,data);	
	}

	@Override
	public void editEmp(EmployeeEntity employeeEntity) {
		String sql="update Employee set Name=?,Salary=?, EmailId=?, Password=? where employeeID=?";
	    Object[] data={employeeEntity.getName(),employeeEntity.getSalary(),employeeEntity.getEmailID(),employeeEntity.getPassword(), employeeEntity.getEmployeeID()};
	    jdbcTemplate.update(sql,data);	
		
	}

	@Override
	public EmployeeEntity requestInfo(int employeeID) {
		EmployeeEntity employeeEntity = null;
		
		String sql = "select * from Employee where employeeID=?";
		Object[] data = {employeeID};
		
		try {
			employeeEntity = jdbcTemplate.queryForObject(sql, data, new BeanPropertyRowMapper<>(EmployeeEntity.class));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return employeeEntity;
	}

}
