package com.springcore.CoreSpringByDurgesh.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Samosa implements InitializingBean , DisposableBean {
	private double price;

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Samosa() {
		super();
	}
	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	public void init() {
		System.out.println("Init Methode...");
	}
	public void destroye() {
		System.out.println("Destroy Methode...");
	}
	

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Init Methode 2...");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroy Methode...");
	}
}