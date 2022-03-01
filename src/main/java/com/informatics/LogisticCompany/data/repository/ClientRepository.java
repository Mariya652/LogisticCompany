package com.informatics.LogisticCompany.data.repository;

import com.informatics.LogisticCompany.data.entity.Clients;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Clients, Long> {

}
