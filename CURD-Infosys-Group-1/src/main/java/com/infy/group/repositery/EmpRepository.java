package com.infy.group.repositery;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infy.group.entites.Employee;
@Repository
public interface EmpRepository extends CrudRepository<Employee, Integer> {

}
