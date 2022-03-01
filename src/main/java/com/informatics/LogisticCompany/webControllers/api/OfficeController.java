package com.informatics.LogisticCompany.webControllers.api;

import com.informatics.LogisticCompany.data.entity.Offices;
import com.informatics.LogisticCompany.services.OfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OfficeController {

    private final OfficeService officeService;

     @Autowired
    public OfficeController(OfficeService officeService){
         this.officeService = officeService;
     }


    @PostMapping(value = "/api/office")
    public Offices createOffice(@RequestBody Offices office) {
        return officeService.createOffice(office);
    }

    @GetMapping(value = "api/offices")
    public List<Offices> findAll(){
         return this.officeService.findAll();
    }

    @GetMapping(value = "api/office/{id}")
    public Offices findById(@PathVariable("id") Long id){
         return this.officeService.findById(id);
    }

    @PutMapping(value = "api/office/{id}")
    public Offices updateOffice(@RequestBody Offices office, @PathVariable("id") Long id){
         return this.officeService.updateOffice(office, id);
    }

    @DeleteMapping(value = "api/office/{id}")
    public void deleteOffice(@PathVariable("id") Long id){
         this.officeService.deleteOffice(id);
    }

}
