package com.springcore.CoreSpringByDurgesh.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientCode {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext
				("com/springcore/CoreSpringByDurgesh/collection/aplicationContext2.xml");
		Emp bean = (Emp)applicationContext.getBean("emp1");
		System.out.println(bean);
		System.out.println(bean.getName());
		System.out.println(bean.getAddresss());
		System.out.println(bean.getCourses());
		System.out.println(bean.getPhones());
	}
}
