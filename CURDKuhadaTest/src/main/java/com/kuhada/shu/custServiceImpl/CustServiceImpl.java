package com.kuhada.shu.custServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kuhada.shu.custRepository.CustDao;
import com.kuhada.shu.entity.Customer;
import com.kuhada.shu.service.CustService;

@Service
public class CustServiceImpl implements CustService {

	@Autowired
	private CustDao custDao;

	@Override
	public Customer save(Customer customer) {
		return custDao.save(customer);
	}

	@Override
	public Customer update(Customer customer) {
		return custDao.save(customer);
	}

	@Override
	public void delete(Integer id) {
		custDao.deleteById(id);		
	}

	@Override
	public Customer get(Integer id) {
		return custDao.findById(id).orElse(null);
		 
	}
}
