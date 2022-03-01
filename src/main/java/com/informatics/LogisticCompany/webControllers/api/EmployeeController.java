package com.informatics.LogisticCompany.webControllers.api;

import com.informatics.LogisticCompany.data.entity.Employees;
import com.informatics.LogisticCompany.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @PostMapping(value = "/api/employee")
    public Employees createCompany(@RequestBody Employees employee) {
        return employeeService.createEmployee(employee);
    }

    @GetMapping(value = "/api/employee/{id}")
    public Employees getEmployeeById(@PathVariable("id") Long id) {
        return employeeService.findById(id);
    }

    @GetMapping(value = "/api/employeeByCompany/{id}")
    public List<Employees> getEmployeeByCompanyId(@PathVariable("id") Long id) {
        return employeeService.getEmployeesByCompanyId(id);
    }

    @PutMapping(value = "api/employee/{id}")
    public Employees updateEmployee(@PathVariable("id") Long id, @RequestBody Employees employee) {
        return employeeService.updateEmployee(employee, id);
    }

    @DeleteMapping(value = "api/employee/{id}")
    public void deleteEmployee(@PathVariable("id") Long id){
        employeeService.deleteEmployee(id);
    }
}
