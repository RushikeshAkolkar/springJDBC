package com.spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.entities.Student;

public class StudentDAOImpl implements StudentDAO{
	
	private JdbcTemplate jdbctemplate;
	@Override
	public int insert(Student student) {
		// TODO Auto-generated method stub
		String query = "insert into student(id,name,city) values(?,?,?)";
		int r = this.jdbctemplate.update(query, student.getId(), student.getName(), student.getCity());
		return r;
	}
	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}
	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}
	

}
