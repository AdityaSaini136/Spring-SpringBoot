package com.test;

public class Addresss {

	private int id;
	private int pin;
	private String city;
	private String state;
	private String landmark;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public Addresss() {

	}
	public Addresss(int id, int pin, String city, String state, String landmark) {
		super();
		this.id = id;
		this.pin = pin;
		this.city = city;
		this.state = state;
		this.landmark = landmark;
	}
	@Override
	public String toString() {
		return "Addresss [id=" + id + ", pin=" + pin + ", city=" + city + ", state=" + state + 
				",landmark=" + landmark+ "]";
	}
}