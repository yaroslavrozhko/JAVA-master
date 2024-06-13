package com.example.masterclass;

import com.example.masterclass.model.User;
import com.example.masterclass.model.Role;
import com.example.masterclass.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UserServiceTests {

    @Autowired
    private UserService userService;

    @Test
    public void testRegisterUser() {
        User user = new User("testuser", "password", "test@example.com", Role.USER);
        User savedUser = userService.registerUser(user);
        assertNotNull(savedUser);
        assertEquals("testuser", savedUser.getUsername());
    }
}
