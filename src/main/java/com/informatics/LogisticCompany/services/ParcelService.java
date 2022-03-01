package com.informatics.LogisticCompany.services;

import com.informatics.LogisticCompany.data.entity.Offices;
import com.informatics.LogisticCompany.data.entity.Parcel;

import java.time.LocalDate;
import java.util.List;

public interface ParcelService {

//    private nowDate
//    TODO validation
    Parcel createParcel(Parcel parcel);

    List<Parcel> findAll();

    Parcel findById(Long parcelId);

    //TODO validation;
    Parcel updateParcel(Parcel parcel, Long id);

    void deleteParcel(Long parcelId);

    List<Parcel> findByEmployeeId(Long Id);

    List<Parcel> findAllByReceiveDateGreaterThan();

    List<Parcel> findBySenderId(Long Id);

    List<Parcel> findByReceiverId(Long Id);

    List<Parcel> findBySendDateGreaterThanEqualAndReceiveDateLessThanEqual(LocalDate startDate, LocalDate endDate);

    List<Parcel> findBySenderIdEqualsOrReceiverIdEquals(Long senderId, Long receiverId);

}
