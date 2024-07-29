package com.springcore.CoreSpringByDurgesh.autowired;

public class Emp {
	
	private Address address;

	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Emp() {
		super();
	}
	public Emp(Address address) {
		this.address = address;
		System.out.println("Constructor..");
	}
	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
}