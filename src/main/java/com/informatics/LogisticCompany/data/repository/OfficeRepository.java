package com.informatics.LogisticCompany.data.repository;

import com.informatics.LogisticCompany.data.entity.Offices;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfficeRepository extends JpaRepository<Offices, Long> {
}
