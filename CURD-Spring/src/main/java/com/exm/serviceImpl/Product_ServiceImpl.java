package com.exm.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exm.Dao.Product_Dao;
import com.exm.entites.Product;
import com.exm.service.Product_Service;

@Service
public class Product_ServiceImpl implements Product_Service {

	@Autowired
	 private Product_Dao product_Dao;
	
	@Override
	public Product save(Product product) {
		return product_Dao.save(product);
	}

	@Override
	public void delete(Integer id) {
		 product_Dao.deleteById(id);
	}

	@Override
	public Product update(Product product) {
		return product_Dao.save(product);
	}

	@Override
	public Product getById(Integer id) {
		return product_Dao.findById(id).orElse(null);
	}
}