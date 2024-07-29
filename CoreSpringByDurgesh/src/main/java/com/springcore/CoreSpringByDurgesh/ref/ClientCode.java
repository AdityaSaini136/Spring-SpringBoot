package com.springcore.CoreSpringByDurgesh.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientCode {

	public static void main(String[] args) {
      ApplicationContext applicationContext = new ClassPathXmlApplicationContext
    		  ("com/springcore/CoreSpringByDurgesh/ref/aplicationContext3.xml");
      A bean = (A)applicationContext.getBean("b1");
		//System.out.println(bean);
		System.out.println(bean.getX());
		//System.out.println(bean.getObj().getY());
		//System.out.println(bean.getObj());
		
	}

}
