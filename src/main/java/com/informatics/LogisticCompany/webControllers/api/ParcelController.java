package com.informatics.LogisticCompany.webControllers.api;

import com.informatics.LogisticCompany.data.entity.Offices;
import com.informatics.LogisticCompany.data.entity.Parcel;
import com.informatics.LogisticCompany.services.ParcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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

    @GetMapping(value = "api/parcelNotReceived")
    public List<Parcel> findAllByReceiveDateGreaterThan(){
        return parcelService.findAllByReceiveDateGreaterThan();
    }

    @GetMapping(value = "api/parcelBySenderId/{id}")
    public List<Parcel> findBySenderId(@PathVariable("id") Long id){
        return parcelService.findBySenderId(id);
    }

    @GetMapping(value = "api/parcelByReceiverId/{id}")
    public List<Parcel> findByReceiverId(@PathVariable("id") Long id){
        return parcelService.findByReceiverId(id);
    }

    @GetMapping(value = "api/parcelBetweenDate/{sendDate}/{receiveDate}")
    public List<Parcel> findBySendDateGreaterThanEqualAndReceiveDateLessThanEqual(@PathVariable("sendDate") String sendDate, @PathVariable("receiveDate") String receiveDate){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate sendDateLocal = LocalDate.parse(sendDate, formatter);
        LocalDate receiveDateLocal = LocalDate.parse(receiveDate, formatter);
        return parcelService.findBySendDateGreaterThanEqualAndReceiveDateLessThanEqual(sendDateLocal, receiveDateLocal);
    }

}
