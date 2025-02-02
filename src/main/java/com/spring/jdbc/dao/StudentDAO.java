package com.spring.jdbc.dao;

import com.spring.jdbc.entities.Student;

public interface StudentDAO {
	
	public int insert(Student student);
	public int change(Student student);
	public int delete(int id);

}
