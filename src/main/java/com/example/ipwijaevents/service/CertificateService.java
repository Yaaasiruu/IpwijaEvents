package com.example.ipwijaevents.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ipwijaevents.entity.Certificate;
import com.example.ipwijaevents.repository.CertificateRepository;

@Service
public class CertificateService {

    @Autowired
    private CertificateRepository certificateRepository;

    public Certificate save(Certificate certificate){
        return certificateRepository.save(certificate);
    }

    public List<Certificate> findAll(){
        return certificateRepository.findAll();
    }

    public Optional<Certificate> findById(Long id){
        return certificateRepository.findById(id);
    }

    public void delete(Long id){
        certificateRepository.deleteById(id);
    }

}
