package com.informatics.LogisticCompany.services.implementations;

import com.informatics.LogisticCompany.data.entity.Clients;
import com.informatics.LogisticCompany.data.entity.Employees;
import com.informatics.LogisticCompany.data.repository.ClientRepository;
import com.informatics.LogisticCompany.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ClientServiceImplementation implements ClientService {

    private ClientRepository clientRepository;

    @Autowired
    public ClientServiceImplementation(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public Clients registerClient(Clients client){
        return clientRepository.save(client);
    }

    @Override
    public List<Clients> findAll(){
        return clientRepository.findAll();
    }

    @Override
    public Clients findById(Long Id){
        return clientRepository.findById(Id).orElseThrow(() -> new IllegalArgumentException());
    }

    @Override
    public Clients updateClient(Clients client, Long id){
        Clients updatedClient = this.findById(id);
        updatedClient.setEmail(client.getEmail());
        updatedClient.setName(client.getName());
        updatedClient.setPassword(client.getPassword());
        updatedClient.setUsername(client.getUsername());
        return clientRepository.saveAndFlush(updatedClient);
    }

    @Override
    public void deleteClient(Long clientId){
        this.clientRepository.deleteById(clientId);
    }
}
