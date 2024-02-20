package com.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.service.Student;

public class StudentSpringMain1 {

	public static void main(String[] args) {
		
		//following line creates spring container	
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springjdbc.xml");
		
		//hey container..give me jdbcTemplate bean
		JdbcTemplate jdbcTemplate=(JdbcTemplate) applicationContext.getBean("jdbcTemplate");

		//insert
//		jdbcTemplate.update("insert into student_db(name,email)values(?,?)", "seema","seema@gmail.com");
		
		//update
//		jdbcTemplate.update("update student_db set email = ? where studentID = ?", "reema@gmail.com", 3);
		
		//delete
//		jdbcTemplate.update("delete from student_db where name= ?","seema");
		
		// select multiple rows..return a blank list
		String sql="select * from student_db";
		
		List<Student> e=(List)jdbcTemplate.query(sql, new BeanPropertyRowMapper(Student.class));
		for(Student student:e) {
			System.out.println(student);
		}
		
	}

}
