package com.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.service.Employee;

public class EmployeeSpringMain1 {

	public static void main(String[] args) {
		
		//following line creates spring container	
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springjdbc.xml");
		
		//hey container..give me jdbcTemplate bean
		JdbcTemplate jdbcTemplate=(JdbcTemplate) applicationContext.getBean("jdbcTemplate");

		//insert
		//jdbcTemplate.update("insert into Employee(Name,Salary)values(?,?)", "seema",4500);
		
//		String sql = "insert into Employee(Name,Salary)values(?,?)";
//		Object[] data = {"hema",4600};
//		jdbcTemplate.update(sql, data);
		
//		String sql = "insert into Employee(Name,Salary)values(?,?)";
//		jdbcTemplate.update(sql, new Object[] {"dema", 4700});
		
		//update
//		jdbcTemplate.update("update employee set Salary = ? where idEmployee = ?", 800, 3);
		
		//delete
		jdbcTemplate.update("delete from employee where Name= ? and salary= ?","dema",4700);
		
		// select multiple rows..return a blank list
		String sql="select * from employee";
		
		List<Employee> e=(List)jdbcTemplate.query(sql, new BeanPropertyRowMapper(Employee.class));
		System.out.println(e);
		
	}

}
