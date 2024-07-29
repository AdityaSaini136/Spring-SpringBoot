package com.kuhada.shu.custRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kuhada.shu.entity.Customer;

@Repository
public interface CustDao extends CrudRepository<Customer, Integer> {

}
