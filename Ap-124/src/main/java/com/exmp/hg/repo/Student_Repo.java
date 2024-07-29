package com.exmp.hg.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.exmp.hg.entity.Students;

@Repository
public interface Student_Repo extends CrudRepository<Students, Integer> {

}
