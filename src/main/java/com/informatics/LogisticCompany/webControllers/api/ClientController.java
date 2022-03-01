package com.informatics.LogisticCompany.webControllers.api;

import com.informatics.LogisticCompany.data.entity.Clients;
import com.informatics.LogisticCompany.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {


    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }


    @PostMapping(value = "/api/client")
    public Clients registerClient(@RequestBody Clients client) {
        return clientService.registerClient(client);
    }

    @GetMapping(value = "api/clientsAll")
    public List<Clients> findAll(){
        return clientService.findAll();
    }

    @PutMapping(value = "api/client/{id}")
    public Clients updateClient(@RequestBody Clients client, @PathVariable("id") Long id){
        return clientService.updateClient(client, id);
    }

    @GetMapping(value = "api/client/{id}")
    public Clients findById(@PathVariable("id") Long id){
        return clientService.findById(id);
    }

    @DeleteMapping(value = "api/client/{id}")
    public void deleteClient(@PathVariable("id") Long id){
        clientService.deleteClient(id);
    }


}
