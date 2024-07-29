package com.exm.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.exm.orm.dao.StudentDao;
import com.exm.orm.entities.Student;

public class App 
{
	public static void main( String[] args )
	{
		System.out.println( "Hello World!" );
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
		StudentDao studentDao = applicationContext.getBean("studentDao", StudentDao.class);
		Student student = new Student(12, "Aditya","Mohali" );
		int insert = studentDao.insert(student);
		System.out.println( " Data Insert......"+insert);
		 
	}
}
