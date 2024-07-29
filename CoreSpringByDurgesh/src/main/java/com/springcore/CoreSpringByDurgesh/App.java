package com.springcore.CoreSpringByDurgesh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	public static void main( String[] args )
	{
		System.out.println( "Hello World!" );
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("aplicationContext.xml");
		Student bean = (Student)applicationContext.getBean("student1");
		Student bean2 = (Student)applicationContext.getBean("student2");
		System.out.println(bean);
		System.out.println(bean2);
	}

}
