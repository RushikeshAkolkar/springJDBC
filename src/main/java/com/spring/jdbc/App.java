package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

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
    	
    	String query = "insert into student(id,name,city) values(?,?,?)";
    	//fire the query
    	int result = template.update(query,111,"Rakesh kadam","Pune");
    	System.out.println("No of values inserted :"+result);
    }
}
