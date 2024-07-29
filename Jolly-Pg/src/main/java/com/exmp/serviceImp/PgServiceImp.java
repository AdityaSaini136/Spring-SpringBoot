package com.exmp.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exmp.entity.PgBoys;
import com.exmp.repository.PgRepository;
import com.exmp.service.PgService;
@Service
public class PgServiceImp implements PgService{
	
	@Autowired PgRepository pgRepository;

	@Override
	public PgBoys save(PgBoys pgBoys) {
		return pgRepository.save(pgBoys);
	}

	@Override
	public PgBoys findById(Integer id) {
		return pgRepository.findById(id).orElse(null);
	}

	@Override
	public List<PgBoys> findAll() {
		List<PgBoys> findAll = this.pgRepository.findAll();
		return findAll;
	}

	@Override
	public PgBoys updateById(PgBoys pgBoys) {
		return pgRepository.save(pgBoys);
	}

	@Override
	public void deleteById(Integer id) {
		pgRepository.deleteById(id);
	}

}
