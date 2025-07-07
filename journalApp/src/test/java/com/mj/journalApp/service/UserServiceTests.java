package com.mj.journalApp.service;

import com.mj.journalApp.entity.User;
import com.mj.journalApp.repository.UserRepository;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UserServiceTests {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @ParameterizedTest
    @ArgumentsSource(UserArgumentsProvider.class)
    public void testSaveNewUser(User user){
        assertTrue(userService.saveNewUser(user));
    }

//    @Disabled
//    @ParameterizedTest
//    @ValueSource(strings = {             //CsvSource({
//            "ram",
//            "ramu",
//            "ramesh"
//    })
//    public void testFindByUserNames(String name){
//        assertNotNull( userRepository.findByUserName(name));
//    }
}
