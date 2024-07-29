package com.exmp.reposerty;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.exmp.entity.PgBoys;
@Repository
public interface PgRepoistory extends CrudRepository<PgBoys, Integer> {

}
