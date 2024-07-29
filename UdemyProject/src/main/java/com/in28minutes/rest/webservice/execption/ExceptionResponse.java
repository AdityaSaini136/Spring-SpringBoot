package com.in28minutes.rest.webservice.execption;

import java.util.Date;

public class ExceptionResponse {
	
	private Date timeStamp;
	private String message;
	private String detials;
	
	public ExceptionResponse(Date timeStamp, String message, String detials) {
		super();
		this.timeStamp = timeStamp;
		this.message = message;
		this.detials = detials;
	}
	public Date getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDetials() {
		return detials;
	}
	public void setDetials(String detials) {
		this.detials = detials;
	}

}
