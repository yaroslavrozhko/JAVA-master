package com.example.masterclass.controller;

import com.example.masterclass.model.Masterclass;
import com.example.masterclass.service.MasterclassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/masterclasses")
public class MasterclassController {

    @Autowired
    private MasterclassService masterclassService;

    @GetMapping
    public List<Masterclass> getAllMasterclasses() {
        return masterclassService.getAllMasterclasses();
    }

    @PostMapping
    public ResponseEntity<Masterclass> createMasterclass(@RequestBody Masterclass masterclass) {
        Masterclass newMasterclass = masterclassService.createMasterclass(masterclass);
        return ResponseEntity.ok(newMasterclass);
    }
}
