package com.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ClientCode {
	public static void main(String[] args) {

		Addresss addresss = new Addresss(1, 247663, "Laksar", "Uttarahand", "Near Transformer");
		Employee employee = new Employee("Aditya Saini", "Telu Ram", "Kuhada Technologies", addresss);
		EmployeeWapper wapper = new EmployeeWapper();
		wapper.setEmployee(employee);

		ObjectMapper mapper = new ObjectMapper();
		try {
			String json = mapper.writeValueAsString(wapper);
			System.out.println("JSON  \n"+json);

			EmployeeWapper wapperFromJson = mapper.readValue(json, EmployeeWapper.class);
			System.out.println("Object \n "+wapperFromJson.getEmployee());
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}
}