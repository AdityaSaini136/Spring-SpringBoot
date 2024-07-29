package com.exmp.service;

import java.util.List;

import com.exmp.entity.PgBoys;

public interface PgService {

	PgBoys save(PgBoys pgBoys);

	PgBoys findById(Integer id);

	List<PgBoys> findAll();

	PgBoys updateById(PgBoys pgBoys);

	void deleteById(Integer id);

}
