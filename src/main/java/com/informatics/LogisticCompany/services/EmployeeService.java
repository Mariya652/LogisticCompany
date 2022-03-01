package com.informatics.LogisticCompany.services;

import com.informatics.LogisticCompany.data.entity.Employees;

import java.util.List;

public interface EmployeeService {
//    TODO validation
    Employees createEmployee(Employees employee);

    List<Employees> getEmployeesByCompanyId(Long companyId);

    Employees findById(Long employeeId);

    //TODO validation;
    Employees updateEmployee(Employees employee, Long Id);

    void deleteEmployee(Long employeeId);

}
