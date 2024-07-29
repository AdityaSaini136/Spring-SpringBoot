package com.springcore.CoreSpringByDurgesh.autowired;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext
				("com/springcore/CoreSpringByDurgesh/autowired/autoconfix.xml");
       Emp bean = (Emp)applicationContext.getBean("emp");
         System.out.println(bean);
	}
}
