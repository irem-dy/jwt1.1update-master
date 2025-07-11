package com.jwtexample.jwt11.controller;

import com.jwtexample.jwt11.dto.PhoneRequestDTO;
import com.jwtexample.jwt11.entity.Phone;
import com.jwtexample.jwt11.service.interfaces.IPhoneService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/phone")
public class PhoneController {

    private final IPhoneService phoneService;

    public PhoneController(IPhoneService phoneService) {
        this.phoneService = phoneService;
    }

    /*
     * passed
     */
    @PostMapping
    public ResponseEntity<Object> save(@RequestBody PhoneRequestDTO phone){
        phoneService.save(phone);
        return new ResponseEntity<>(phone.toString() + " added", HttpStatus.OK);
    }

    /*
     * passed
     */
    @GetMapping
    public List<Phone> findAll() {
        return phoneService.findAll();
    }

    /*
     * passed
     */
    @GetMapping("/{id}")
    public Phone findById(@PathVariable Long id){
        return phoneService.findById(id);
    }

    @PutMapping
    public ResponseEntity<Object> update(@RequestBody PhoneRequestDTO phone){
        this.phoneService.update(phone);
        return new ResponseEntity<>(phone.toString() + "excellence", HttpStatus.OK);
    }

    /*
     * passed
     */
    @DeleteMapping("{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        phoneService.delete(id);
        return new ResponseEntity<>(id + " lid adres silindi", HttpStatus.OK);
    }
}