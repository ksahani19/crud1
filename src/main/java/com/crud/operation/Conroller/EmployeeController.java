package com.crud.operation.Conroller;

import com.crud.operation.Entity.Employee;
import com.crud.operation.Service.ServiceEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/post")
public class EmployeeController {

    @Autowired
    private ServiceEmployee serviceEmployee;

    @PostMapping("/save/employee")
    public void saveEmployee(@RequestBody Employee employee){
         serviceEmployee.saveEmployee(employee);

    }
    @GetMapping("/get/employee")
    public List<Employee> getEmployee(){
        return employeeService.getEmployees();

    }
    @GetMapping("/get/employee/{employeeId}")
    public Employee getEmployee(@PathVariable Integer employee){
        return serviceEmployee.getEmployees(employeeId);

    }
    @DeleteMapping("/delete/employee/{employeeId}")
    public void deleteEmployee(@PathVariable Integer employeeId){
        employeeService.deleteEmployee(employeeId);
    }
    @PutMapping("/update/employee")
    public Employee updateEmployee(@RequestBody Employee employee){
        return employeeService.updateEmployee(employee);
    }

}
