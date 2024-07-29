package com.springcore.CoreSpringByDurgesh.constructorinjection;

public class Emp {

	private String name;
	private int empid;
	private Crerti crerti;

	@Override
	public String toString() {
		return this.name +" : "+this.empid+"{"+this.crerti.name+"}";
	}

	public Emp(String name, int empid,Crerti crerti) {
		super();
		this.name = name;
		this.empid = empid;
		this.crerti = crerti;
	}
}