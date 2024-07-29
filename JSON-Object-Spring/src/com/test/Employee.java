package com.test;

public class Employee {
	private String name;
	private String fname;
	private String comName;
	private Addresss addresss;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getComName() {
		return comName;
	}
	public void setComName(String comName) {
		this.comName = comName;
	}
	public Addresss getAddresss() {
		return addresss;
	}
	public void setAddresss(Addresss addresss) {
		this.addresss = addresss;
	}

	public Employee() {
	}
	public Employee(String name, String fname, String comName, Addresss addresss) {
		super();
		this.name = name;
		this.fname = fname;
		this.comName = comName;
		this.addresss = addresss;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", fname=" + fname + ", comName=" + comName + ", addresss=" + addresss + "]";
	}
}