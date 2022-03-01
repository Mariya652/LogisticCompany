package com.informatics.LogisticCompany.services;

import com.informatics.LogisticCompany.data.entity.LogisticCompany;

import java.util.List;

public interface LogisticCompanyService {
    LogisticCompany create(LogisticCompany company);

//    List<LogisticCompany> findAll();

    LogisticCompany findById(Long companyId);

//TODO validation;
    LogisticCompany updateCompany(LogisticCompany company, Long id);

    void deleteCompany(Long companyId);


}
