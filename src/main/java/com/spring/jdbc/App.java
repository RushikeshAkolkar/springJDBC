package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDAO;
import com.spring.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //spring jdbc = >JdbcTemplate
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
    	JdbcTemplate template = (JdbcTemplate) context.getBean("jdbctemplate");
    	
    	StudentDAO studentdao =  (StudentDAO) context.getBean("studentdao");
    	
    	/*Student student = new Student();
    	student.setId(11);
    	student.setName("Kishor Akolkar");
    	student.setCity("Pune");
    	
    	int r = studentdao.delete(11);
    	System.out.println("student is change "+r);*/
    	//getting from database
    	
    	Student student = studentdao.getStudent(111);
    	System.out.println(student);
    	
    }
}
