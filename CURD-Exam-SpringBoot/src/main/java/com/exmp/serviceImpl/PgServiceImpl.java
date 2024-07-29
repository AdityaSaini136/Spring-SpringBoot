 package com.exmp.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exmp.entity.PgBoys;
import com.exmp.reposerty.PgRepoistory;
import com.exmp.service.PgService;
@Service
public class PgServiceImpl implements PgService {
	
	@Autowired
    private PgRepoistory pgRepoistory;
	
	@Override
	public PgBoys save(PgBoys pgBoys) {
		return pgRepoistory.save(pgBoys);
	}

	@Override
	public void deleteById(Integer id) {
		pgRepoistory.deleteById(id);
	}

	@Override
	public PgBoys update(PgBoys pgBoys) {
		return pgRepoistory.save(pgBoys);
	}

	@Override
	public PgBoys getById(Integer id) {
		return  pgRepoistory.findById(id).orElse(null);
	}

}
