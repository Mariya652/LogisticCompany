package com.informatics.LogisticCompany.services.implementations;

import com.informatics.LogisticCompany.data.entity.Parcel;
import com.informatics.LogisticCompany.data.repository.ParcelRepository;
import com.informatics.LogisticCompany.services.ParcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ParcelServiceImplementations implements ParcelService {

    private final ParcelRepository parcelRepository;

    @Autowired
    ParcelServiceImplementations(ParcelRepository parcelRepository){
        this.parcelRepository = parcelRepository;
    }


    @Override
    public Parcel createParcel(Parcel parcel){
        return this.parcelRepository.save(parcel);
    }

    @Override
    public List<Parcel> findAll(){
        return this.parcelRepository.findAll();
    }

    @Override
    public Parcel findById(Long parcelId){
        return this.parcelRepository.findById(parcelId).orElseThrow(() -> new IllegalArgumentException());
    }

    @Override
    public Parcel updateParcel(Parcel parcel, Long id){
        Parcel updatedParcel = this.findById(id);
        updatedParcel.setAddressTo(parcel.getAddressTo());
        return this.parcelRepository.saveAndFlush(updatedParcel);
    }

    @Override
    public void deleteParcel(Long parcelId){
        this.parcelRepository.deleteById(parcelId);
    }

    @Override
    public List<Parcel> findByEmployeeId(Long id){
        return this.parcelRepository.findByEmployeeId(id);
    }

    @Override
    public List<Parcel> findAllByReceiveDateGreaterThan(){
        LocalDate now = LocalDate.now();
        return this.parcelRepository.findAllByReceiveDateGreaterThan(now);
    }

    @Override
    public List<Parcel> findBySenderId(Long id){
        return this.parcelRepository.findBySenderId(id);
    }

    @Override
    public List<Parcel> findByReceiverId(Long id){
        return this.parcelRepository.findByReceiverId(id);
    }

    @Override
    public List<Parcel> findBySendDateGreaterThanEqualAndReceiveDateLessThanEqual(LocalDate startDate, LocalDate endDate){
        return this.parcelRepository.findBySendDateGreaterThanEqualAndReceiveDateLessThanEqual(startDate,endDate);
    }

    @Override
    public List<Parcel> findBySenderIdEqualsOrReceiverIdEquals(Long senderId, Long receiverId){
        return this.parcelRepository.findBySenderIdEqualsOrReceiverIdEquals(senderId, receiverId);
    }

}
