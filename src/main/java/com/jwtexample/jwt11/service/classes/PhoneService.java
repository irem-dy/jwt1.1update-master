package com.jwtexample.jwt11.service.classes;

import com.jwtexample.jwt11.dto.PhoneRequestDTO;
import com.jwtexample.jwt11.entity.Phone;
import com.jwtexample.jwt11.entity.User;
import com.jwtexample.jwt11.repo.PhoneRepo;
import com.jwtexample.jwt11.service.classes.UserService;
import com.jwtexample.jwt11.service.interfaces.IPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneService implements IPhoneService {

    private final PhoneRepo phoneRepo;
    private final UserService userService;

    @Autowired
    public PhoneService(PhoneRepo phoneRepo, UserService userService) {
        this.phoneRepo = phoneRepo;
        this.userService = userService;
    }

    public void save(PhoneRequestDTO request) {
        User user = userService.findById(request.getUserId());
        Phone newPhone = new Phone(request.getNumber(), user);
        phoneRepo.save(newPhone);
    }

    public List<Phone> findAll() {
        return phoneRepo.findAll();
    }

    public Phone findById(Long id) {
        return phoneRepo.findById(id).orElse(null);
    }

    public void update(PhoneRequestDTO request) {
        User user = phoneRepo.findById(request.getPhoneId()).get().getUser();
        Phone updatedPhone = new Phone(request.getPhoneId(), request.getNumber(), user);
        phoneRepo.save(updatedPhone);
    }

    public void delete(Long id) {
        phoneRepo.deleteById(id);
    }
}
