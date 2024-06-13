package com.example.masterclass;

import com.example.masterclass.model.Masterclass;
import com.example.masterclass.service.MasterclassService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class MasterclassServiceTests {

    @Autowired
    private MasterclassService masterclassService;

    @Test
    public void testCreateMasterclass() {
        Masterclass masterclass = new Masterclass();
        masterclass.setTitle("Test Masterclass");
        masterclass.setDescription("This is a test masterclass.");
        masterclass.setLocation("Online");
        masterclass.setOnline(true);
        Masterclass savedMasterclass = masterclassService.createMasterclass(masterclass);
        assertNotNull(savedMasterclass);
        assertEquals("Test Masterclass", savedMasterclass.getTitle());
    }
}
