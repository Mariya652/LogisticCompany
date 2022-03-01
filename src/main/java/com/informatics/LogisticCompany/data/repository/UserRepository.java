package com.informatics.LogisticCompany.data.repository;

import com.informatics.LogisticCompany.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {


    Optional<User> findByUsername(String username);
}
