package com.mycar.notifications.services;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class KafkaConsumerService {
    private final String topicName = "B2N-topic";

    @KafkaListener(topics = topicName, groupId = "my-consumer-group")
    public void consumeMessage(String message) {
        System.out.println("Mensaje recibido: " + message);
        // Procesar el mensaje aquí
    }
}


