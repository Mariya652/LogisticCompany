package com.informatics.LogisticCompany.services;

import com.informatics.LogisticCompany.data.entity.Clients;

import java.util.List;

public interface ClientService {
    //    TODO validation
    Clients registerClient(Clients client);

    List<Clients> findAll();

    //TODO validation;
    Clients updateClient(Clients client, Long Id);

    Clients findById(Long Id);

    void deleteClient(Long clientId);

}
