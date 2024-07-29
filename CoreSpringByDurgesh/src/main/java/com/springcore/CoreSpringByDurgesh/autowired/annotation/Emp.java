package com.springcore.CoreSpringByDurgesh.autowired.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
	
	private Address address;

	public Address getAddress() {
		return address;
	}
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Setter Method....");
	}
	public Emp() {
		super();
	}
	public Emp(Address address) {
		this.address = address;
		//System.out.println("Constructor..");
	}
	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
}