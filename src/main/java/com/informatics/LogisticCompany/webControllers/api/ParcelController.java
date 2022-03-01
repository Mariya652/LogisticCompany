package com.informatics.LogisticCompany.webControllers.api;

import com.informatics.LogisticCompany.data.entity.Offices;
import com.informatics.LogisticCompany.data.entity.Parcel;
import com.informatics.LogisticCompany.services.ParcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ParcelController {

    private final ParcelService parcelService;

    @Autowired
    public ParcelController(ParcelService parcelService) {
        this.parcelService = parcelService;
    }

    @PostMapping(value = "/api/parcel")
    public Parcel createParcel(@RequestBody Parcel parcel) {
        return parcelService.createParcel(parcel);
    }

    @GetMapping(value = "api/parcel")
    public List<Parcel> findAll(){
        return parcelService.findAll();
    }

    @GetMapping(value = "api/parcel/{id}")
    public Parcel findById(@PathVariable("id") Long id){ return parcelService.findById(id); }

    @PutMapping(value = "api/parcel/{id}")
    public Parcel updateParcel(@RequestBody Parcel parcel, @PathVariable("id") Long id){
        return parcelService.updateParcel(parcel, id);
    }

    @DeleteMapping(value = "api/parcel/{id}")
    public void deleteParcel(@PathVariable("id") Long id){
        parcelService.deleteParcel(id);
    }

    @GetMapping(value = "api/parcelByEmployee/{employeeId}")
    public List<Parcel> findByEmployeeId(@PathVariable("employeeId") Long id){
        return parcelService.findByEmployeeId(id);
    }

}
