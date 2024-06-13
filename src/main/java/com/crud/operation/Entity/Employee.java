package com.crud.operation.Entity;

import jakarta.persistence.*;


@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer EmployeeId;
    private String EmployeeName;
    private String EmployeeGender;
    private String EmployeeAddress;
    private String EmployeeContactNumber;
    private String EmployeeDepartment;

    public Employee() {
    }

    public Integer getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        EmployeeId = employeeId;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public String getEmployeeGender() {
        return EmployeeGender;
    }

    public void setEmployeeGender(String employeeGender) {
        EmployeeGender = employeeGender;
    }

    public String getEmployeeAddress() {
        return EmployeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        EmployeeAddress = employeeAddress;
    }

    public String getEmployeeContactNumber() {
        return EmployeeContactNumber;
    }

    public void setEmployeeContactNumber(String employeeContactNumber) {
        EmployeeContactNumber = employeeContactNumber;
    }

    public String getEmployeeDepartment() {
        return EmployeeDepartment;
    }

    public void setEmployeeDepartment(String employeeDepartment) {
        EmployeeDepartment = employeeDepartment;
    }
}