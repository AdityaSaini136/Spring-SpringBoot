package com.springcore.CoreSpringByDurgesh.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AnnotationExample {
	
	public String subject;

	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public AnnotationExample(String subject) {
		super();
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "AnnotationExample [subject=" + subject + "]";
	}
	@PostConstruct
	public void start() {
		System.out.println("Starting Or Init  Methode.......");
	}
	@PreDestroy
	public void end() {
		System.out.println("Ending  Or Destroy Methode.....");
	}
}