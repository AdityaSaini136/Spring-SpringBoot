package com.exmp.service;

import com.exmp.entity.PgBoys;

public interface PgService {

	PgBoys save(PgBoys pgBoys);

	void deleteById(Integer id);

	PgBoys update(PgBoys pgBoys);

	PgBoys getById(Integer id);

}
