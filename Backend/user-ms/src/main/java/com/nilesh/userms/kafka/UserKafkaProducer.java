package com.nilesh.userms.kafka;

import com.nilesh.userms.entity.User;

public interface UserKafkaProducer {
    void createUserEventProducer(User user);
}
