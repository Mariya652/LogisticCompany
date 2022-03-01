package com.informatics.LogisticCompany.services.implementations;

import com.informatics.LogisticCompany.data.entity.LogisticCompany;
import com.informatics.LogisticCompany.data.repository.LogisticCompanyRepository;
import com.informatics.LogisticCompany.services.LogisticCompanyService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogisticCompanyServiceImplementation implements LogisticCompanyService {


    private LogisticCompanyRepository logisticCompanyRepository;

    @Autowired
    public LogisticCompanyServiceImplementation(LogisticCompanyRepository logisticCompanyRepository) {
        this.logisticCompanyRepository = logisticCompanyRepository;
    }

    @Override
    public LogisticCompany create(LogisticCompany company) {
        return logisticCompanyRepository.save(company);
    }

    @Override
    public LogisticCompany findById(Long companyId) {

        return logisticCompanyRepository.findById(companyId).orElseThrow(() -> new IllegalArgumentException());
    };

    @Override
    public LogisticCompany updateCompany(LogisticCompany company, Long Id){

        LogisticCompany updatedCompany = this.findById(Id);
        updatedCompany.setName(company.getName());
        return this.logisticCompanyRepository.saveAndFlush(updatedCompany);
    };

    @Override
    public void deleteCompany(Long companyId){
        logisticCompanyRepository.deleteById(companyId);

    };



}
