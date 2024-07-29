package com.exm.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext
        		("com/exm/annotation/autoconfix.xml");
        Employee emp = (Employee)applicationContext.getBean("emp");
        System.out.println(emp);
    }
}
