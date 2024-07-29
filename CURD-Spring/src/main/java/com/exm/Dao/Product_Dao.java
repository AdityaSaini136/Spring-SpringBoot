package com.exm.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.exm.entites.Product;
@Repository
public interface Product_Dao  extends  CrudRepository<Product, Integer>{

}
