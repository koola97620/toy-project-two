package com.example.study;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class TopicOneListener {

    @KafkaListener(topics = "topic1", groupId = "testGroup1")
    public void listenByTestGroupOne(String message) {
        System.out.println("Received Message in testGroup1 : " + message);
    }
}
