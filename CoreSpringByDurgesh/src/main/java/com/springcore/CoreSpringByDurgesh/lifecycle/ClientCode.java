package com.springcore.CoreSpringByDurgesh.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientCode {

	public static void main(String[] args) {
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext
				("com/springcore/CoreSpringByDurgesh/lifecycle/aplicationContext5.xml");
		//Samosa bean = (Samosa)applicationContext.getBean("sam");
		//System.out.println(bean);
         applicationContext.registerShutdownHook();
         AnnotationExample bean = (AnnotationExample)applicationContext.getBean("anno");
         System.out.println(bean);
	}
}
