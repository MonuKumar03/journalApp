//package com.mj.journalApp.service;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.mail.javamail.JavaMailSender;
//
////@SpringBootTest
//@ExtendWith(MockitoExtension.class)
//public class EmailServiceTest {
//
//    @InjectMocks
//    private EmailService emailService;
//
//    @Mock
//    private JavaMailSender javaMailSender;
//
//    @Test
//    void testSendMail(){
//        emailService.sendEmail("monukjaiswal123@gmail.com",
//                "Testing Java mail sender",
//                "Hi, how are you");
//    }
//}
