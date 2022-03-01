package com.informatics.LogisticCompany.services;

import com.informatics.LogisticCompany.data.entity.Clients;
import com.informatics.LogisticCompany.data.entity.Offices;

import java.util.List;

public interface OfficeService {

    //    TODO validation
    Offices createOffice(Offices office);

    List<Offices> findAll();

    Offices findById(Long officeId);

    //TODO validation;
    Offices updateOffice(Offices office, Long id);

    void deleteOffice(Long officeId);
}
