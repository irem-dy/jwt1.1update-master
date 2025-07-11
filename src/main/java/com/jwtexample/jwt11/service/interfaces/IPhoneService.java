package com.jwtexample.jwt11.service.interfaces;

import com.jwtexample.jwt11.dto.PhoneRequestDTO;
import com.jwtexample.jwt11.entity.Phone;

import java.util.List;

public interface IPhoneService {
    void save(PhoneRequestDTO address);
    List<Phone> findAll();
    Phone findById(Long id);
    void update(PhoneRequestDTO phone);
    void delete(Long id);
}