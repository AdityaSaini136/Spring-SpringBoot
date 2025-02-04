package com.epam;

import java.util.Date;
import java.util.spi.CalendarNameProvider;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ClientCode {
	public static void main(String[] args) {
		Date dob = new Date(1997, 12, 10);
		Date doj = new Date(2022, 06, 05);
		Address address = new Address(247663, 1562, "Near Transformer", "Laksar", 
				"Haridwar", "Uttarakhand", "Indian"); 
		Employee employee = new Employee(1, "Aditya Saini", "Telu Ram", "Kuhada", 
				"Java",dob, doj, address);
		EmployeeWapper wapper = new EmployeeWapper();
		wapper.setEmployee(employee);
		ObjectMapper mapper = new ObjectMapper();
		try {
			String json = mapper.writeValueAsString(wapper);
			System.out.println("JSON : \n"+json);

			EmployeeWapper wrapperFromJson = mapper.readValue(json, EmployeeWapper.class);
			System.out.println("Object : \n"+wrapperFromJson.getEmployee());    
			
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}
}
