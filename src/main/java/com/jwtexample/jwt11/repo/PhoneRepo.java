package com.jwtexample.jwt11.repo;

import com.jwtexample.jwt11.entity.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PhoneRepo extends JpaRepository<Phone, Long> {

}