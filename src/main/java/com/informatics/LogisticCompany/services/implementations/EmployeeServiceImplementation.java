package com.informatics.LogisticCompany.services.implementations;

import com.informatics.LogisticCompany.data.entity.Employees;
import com.informatics.LogisticCompany.data.repository.EmployeesRepository;
import com.informatics.LogisticCompany.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImplementation implements EmployeeService {

    private EmployeesRepository employeesRepository;

    @Autowired
    public EmployeeServiceImplementation(EmployeesRepository employeesRepository) {
        this.employeesRepository = employeesRepository;
    }

    @Override
    public Employees createEmployee(Employees employee) {
        return employeesRepository.save(employee);
    }

    @Override
    public Employees findById(Long employeeId) {
        return employeesRepository.findById(employeeId).orElseThrow(() -> new IllegalArgumentException());
    }

    @Override
    public List<Employees> getEmployeesByCompanyId(Long Id) {
        return employeesRepository.findAllByCompanyId(Id);
    }

    @Override
    public Employees updateEmployee(Employees employee, Long Id){
        Employees updatedEmployee = this.findById(Id);
        updatedEmployee.setName(employee.getName());
        updatedEmployee.setCompany(employee.getCompany());
        updatedEmployee.setOffice(employee.getOffice());
        updatedEmployee.setUsername(employee.getUsername());
        updatedEmployee.setEmail(employee.getEmail());
        updatedEmployee.setPassword(employee.getPassword());
        return this.employeesRepository.saveAndFlush(updatedEmployee);
    }

    @Override
    public void deleteEmployee(Long employeeId){
        employeesRepository.deleteById(employeeId);

    }

}
