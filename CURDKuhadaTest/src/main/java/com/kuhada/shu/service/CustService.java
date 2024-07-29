package com.kuhada.shu.service;

import com.kuhada.shu.entity.Customer;

public interface CustService {

	Customer save(Customer customer);

	Customer update(Customer customer);

	void delete(Integer id);

	Customer get(Integer id);

}
