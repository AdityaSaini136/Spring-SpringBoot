package com.exm.execption;

public class ProductNotFoundExecption extends RuntimeException {
	
	public ProductNotFoundExecption ( String msg) {
		super(msg);
	}
} 
