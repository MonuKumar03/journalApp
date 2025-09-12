//package com.mj.journalApp.service;
//
//import com.mj.journalApp.model.SentimentsData;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.stereotype.Service;
//
//@Service
//public class SentimentConsumerService {
//    @Autowired
//    private EmailService emailService;
//
//    @KafkaListener(topics = "weekly-sentiments", groupId = "weekly-sentiment-group")
//    public void consume(SentimentsData sentimentData) {
//        sendEmail(sentimentData);
//    }
//
//    private void sendEmail(SentimentsData sentimentData) {
//        emailService.sendEmail(sentimentData.getEmail(), "Sentiment for previous week", sentimentData.getSentiment());
//    }
//}
