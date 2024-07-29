package com.exmp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.exmp.entity.PgBoys;

@Repository
public interface PgRepository  extends JpaRepository<PgBoys, Integer>{

}
 