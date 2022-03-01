package com.informatics.LogisticCompany.data.repository;

import com.informatics.LogisticCompany.data.entity.Employees;
import com.informatics.LogisticCompany.data.entity.LogisticCompany;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeesRepository extends JpaRepository<Employees, Long> {


    List<Employees> findAllByCompanyId(Long Id);
}
