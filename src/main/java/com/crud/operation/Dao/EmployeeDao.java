package com.crud.operation.Dao;

import com.crud.operation.Entity.Employee;
import org.springframework.data.repository.CrudRepository;


public interface EmployeeDao extends CrudRepository<Employee,Integer> {
}
