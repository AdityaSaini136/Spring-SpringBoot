package com.springcore.CoreSpringByDurgesh.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientCode {
	public static void main(String[] args) {
	
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext
				("com/springcore/CoreSpringByDurgesh/constructorinjection/aplicationContext4.xml");
		Emp bean = (Emp)applicationContext.getBean("Emp");
		System.out.println(bean);
		Addition bean2 = (Addition)applicationContext.getBean("add");
		bean2.doSum();
	}
}
