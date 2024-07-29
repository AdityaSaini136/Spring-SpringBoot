package com.exmp.hg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exmp.hg.entity.Employee;

@Repository
public interface EmpRepository extends  JpaRepository<Employee, Integer> {

}
