package com.informatics.LogisticCompany.services.implementations;

import com.informatics.LogisticCompany.data.entity.Employees;
import com.informatics.LogisticCompany.data.entity.Offices;
import com.informatics.LogisticCompany.data.repository.OfficeRepository;
import com.informatics.LogisticCompany.services.OfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OfficeServiceImplementation implements OfficeService {

    private final OfficeRepository officeRepository;

    @Autowired
    public OfficeServiceImplementation(OfficeRepository officeRepository){
        this.officeRepository = officeRepository;
    }

    @Override
    public Offices createOffice(Offices office){
         return this.officeRepository.save(office);
    }

    @Override
    public List<Offices> findAll(){
        return this.officeRepository.findAll();
    }

    @Override
    public Offices findById(Long officeId){
        return this.officeRepository.findById(officeId).orElseThrow(() -> new IllegalArgumentException());
    }

    @Override
    public void deleteOffice(Long officeId){
        this.officeRepository.deleteById(officeId);
    }

    @Override
    public Offices updateOffice(Offices office, Long id){
        Offices updatedOffice = this.findById(id);
        updatedOffice.setName(office.getName());
        updatedOffice.setAddress(office.getAddress());
        updatedOffice.setEmployeesList(office.getEmployeesList());
        return this.officeRepository.saveAndFlush(updatedOffice);
    }
}
