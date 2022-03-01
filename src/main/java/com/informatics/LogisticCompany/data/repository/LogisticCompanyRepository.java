package com.informatics.LogisticCompany.data.repository;

import com.informatics.LogisticCompany.data.entity.LogisticCompany;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface LogisticCompanyRepository extends JpaRepository<LogisticCompany, Long> {

    List<LogisticCompany> findAllByName(String name);


}
