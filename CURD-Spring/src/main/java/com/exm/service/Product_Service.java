package com.exm.service;

import com.exm.entites.Product;

public interface Product_Service {

	Product  save( Product product);

	void delete(Integer id);

	Product update(Product product);

	Product getById(Integer id);


}
