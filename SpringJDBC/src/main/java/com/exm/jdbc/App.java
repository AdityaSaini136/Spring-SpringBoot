package com.exm.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.exm.jdbc.dao.StudentDao;
import com.exm.jdbc.entites.Student;

public class App {
	public static void main( String[] args ){
		System.out.println( "Application Started..................!" );
		//spring jdbc >===> jdbctamplate
        
		//for xml base...................!
		//ApplicationContext context = new ClassPathXmlApplicationContext("com/exm/jdbc/config.xml");
		
		//for JDBCConfig class.........................!
		ApplicationContext  context = new AnnotationConfigApplicationContext(JDBCConfig.class);
		// 1st method for insert Data Query .........
		JdbcTemplate tamplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
		//String query = "insert into student(id,name,city) values(?,?,?)"; 
		//int insert2 = tamplate.update(query,"4", "Sandeep", "Mohali");
		//System.out.println("First method se data insert...."+insert2);
		
		//2nd Method  for insert Data  Query ........
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
//		Student student =  new Student();
//		student.setId(3);
//		student.setName("Aman");
//		student.setCity("Noida");
//		int insert = studentDao.insert(student);
//		System.out.println("Second Method se Data insert...........! " +insert);
		
		//for update ......................
		//int update = studentDao.update(student);
		//System.out.println("Data updated...........! " +update);
	    
		// delete................	
		//int delete = studentDao.delete(3);
		//System.out.println("deleted " +delete);
		
		//Select single  Data............................
		//Student getStudent = studentDao.getStudent(1);
		//System.out.println(getStudent);
		
		//Select All Data............................
		List<Student> allStudent = studentDao.getAllStudent();
		System.out.println(allStudent);
	}
}
