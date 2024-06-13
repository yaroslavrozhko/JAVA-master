package com.example.masterclass.repository;

import com.example.masterclass.model.Masterclass;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MasterclassRepository extends JpaRepository<Masterclass, Long> {
}
