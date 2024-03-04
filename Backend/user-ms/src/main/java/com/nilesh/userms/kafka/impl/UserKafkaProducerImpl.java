package com.nilesh.userms.kafka.impl;

import com.nilesh.basedomains.events.CreateUserEvent;
import com.nilesh.userms.entity.User;
import com.nilesh.userms.kafka.UserKafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component
public class UserKafkaProducerImpl implements UserKafkaProducer {

    @Autowired
    private KafkaTemplate<String , CreateUserEvent> createUserEventKafkaTemplate;

    @Override
    public void createUserEventProducer(User user) {
        CreateUserEvent createUserEvent=new CreateUserEvent();
        createUserEvent.setUsername(user.getUsername());
        createUserEvent.setEmail(user.getEmail());
        createUserEvent.setPassword(user.getPassword());
        createUserEvent.setDateOfBirth(user.getDateOfBirth());

        Message<CreateUserEvent> message= MessageBuilder.
                withPayload(createUserEvent).
                setHeader(KafkaHeaders.TOPIC,"CreateUserEvent").
                build();

        createUserEventKafkaTemplate.send(message);
    }
}
