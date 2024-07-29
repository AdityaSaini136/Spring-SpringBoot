package com.springcore.CoreSpringByDurgesh.autowired.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.CoreSpringByDurgesh.autowired.Emp;

public class ClientCode {
	public static void main(String[] args) {
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext
				("com/springcore/CoreSpringByDurgesh/autowired/autoconfix.xml");
       Emp bean = (Emp)applicationContext.getBean("emp");
         System.out.println(bean);
	}

}
