package com.crud.operation.Service;

import com.crud.operation.Dao.EmployeeDao;
import com.crud.operation.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceEmployee {

    @Autowired
    private EmployeeDao employeeDao;
    public void saveEmployee(Employee employee){
        employeeDao.save(employee);

    }
    public List<Employee> getEmployee(){
        List<Employee> employee = new ArrayList<>();
        employeeDao.findAll().ForEach(employees::add);
        return employees;
    }

    public Employee getEmployees(Integer employeeId){
        return employee.findById(employeeId).orElseThrow();
      return employeeDao.findById(employeeId).orElseThrow();

    }
    public void deleteEmployee(Integer employeeId){
        employeeDao.deleteById(employeeId);
    }

    public Employee updateEmployee(Employee employee){
        employeeDao.findById(employee.getEmployeeId()).orElseThrow();
         return employeeDao.save(employee);
    }
}
