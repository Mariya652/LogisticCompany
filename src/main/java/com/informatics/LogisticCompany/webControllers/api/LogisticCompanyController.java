package com.informatics.LogisticCompany.webControllers.api;

import com.informatics.LogisticCompany.data.entity.LogisticCompany;
import com.informatics.LogisticCompany.services.LogisticCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LogisticCompanyController {

    private final LogisticCompanyService logisticCompanyService;

    @Autowired
    public LogisticCompanyController(LogisticCompanyService logisticCompanyService) {
        this.logisticCompanyService = logisticCompanyService;
    }


    @PostMapping(value = "/api/logisticCompany")
    public LogisticCompany createCompany(@RequestBody LogisticCompany logisticCompany) {
        return logisticCompanyService.create(logisticCompany);
    }

    @GetMapping(value = "/api/logisticCompany/{id}")
    public LogisticCompany getCompanyById(@PathVariable("id") Long id) {
        return logisticCompanyService.findById(id);
    }

    @PutMapping(value = "api/logisticCompany/{id}")
    public LogisticCompany updateCompany(@PathVariable("id") Long id, @RequestBody LogisticCompany company) {
        return logisticCompanyService.updateCompany(company, id);
    }

    @DeleteMapping(value = "api/logisticCompany/{id}")
    public void deleteCompany(@PathVariable("id") Long id){
        logisticCompanyService.deleteCompany(id);
    }
}
