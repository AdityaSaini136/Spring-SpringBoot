package com.exm.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
    @Autowired
	private Address address;
    
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Setter Method............");
	}

	public Employee(Address address) {
		super();
		this.address = address;
		System.out.println("Constructor Methode...........");
	}
	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
}
