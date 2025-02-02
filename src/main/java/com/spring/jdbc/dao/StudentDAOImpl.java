package com.spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.entities.Student;

public class StudentDAOImpl implements StudentDAO{
	
	private JdbcTemplate jdbctemplate;
	
	@Override
	public int insert(Student student) {
		
		String query = "insert into student(id,name,city) values(?,?,?)";
		int r = this.jdbctemplate.update(query, student.getId(), student.getName(), student.getCity());
		return r;
	}
	
	@Override
	public int change(Student student) {
		//updating data
		String query = "update student set name = ?, city = ? where id = ?";
		int r = this.jdbctemplate.update(query, student.getName(), student.getCity(),student.getId());
		return r;
	}
	@Override
	public int delete(int id) {
		String query = "delete from student where id = ?";
		int r = this.jdbctemplate.update(query, id);
		return r;
	}
	
	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}
	
	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

	
	
	

}
