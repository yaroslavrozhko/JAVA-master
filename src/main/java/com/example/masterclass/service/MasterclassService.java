package com.example.masterclass.service;

import com.example.masterclass.model.Masterclass;
import com.example.masterclass.repository.MasterclassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MasterclassService {

    @Autowired
    private MasterclassRepository masterclassRepository;

    public List<Masterclass> getAllMasterclasses() {
        return masterclassRepository.findAll();
    }

    public Masterclass createMasterclass(Masterclass masterclass) {
        return masterclassRepository.save(masterclass);
    }
}
