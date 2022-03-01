package com.informatics.LogisticCompany.data.repository;

import com.informatics.LogisticCompany.data.entity.Parcel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;

public interface ParcelRepository extends JpaRepository<Parcel, Long> {

    List<Parcel> findByEmployeeId(Long Id);

    List<Parcel> findAllByReceiveDateGreaterThan(LocalDate now);


    List<Parcel> findBySenderId(Long Id);

    List<Parcel> findByReceiverId(Long Id);

    List<Parcel> findBySendDateGreaterThanEqualAndReceiveDateLessThanEqual(LocalDate startDate, LocalDate endDate);

    List<Parcel> findBySenderIdEqualsOrReceiverIdEquals(Long senderId, Long receiverId);
}
