package com.example.ipwijaevents.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ipwijaevents.entity.Registration;
import com.example.ipwijaevents.repository.RegistrationRepository;

@Service
public class RegistrationService {

    @Autowired
    private RegistrationRepository registrationRepository;

    public Registration save(Registration registration){
        return registrationRepository.save(registration);
    }

    public List<Registration> findAll(){
        return registrationRepository.findAll();
    }

    public Optional<Registration> findById(Long id){
        return registrationRepository.findById(id);
    }

    public void delete(Long id){
        registrationRepository.deleteById(id);
    }

}