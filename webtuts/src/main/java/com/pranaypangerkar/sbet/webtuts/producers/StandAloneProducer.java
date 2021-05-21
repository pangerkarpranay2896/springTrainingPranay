package com.pranaypangerkar.sbet.webtuts.producers;

import com.pranaypangerkar.sbet.webtuts.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class StandAloneProducer {

    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;

    private static final String TOPIC = "kafka_spring_boot_demo";

    @GetMapping("/publish/{name}")
    public String post(@PathVariable("name") final String name){

        kafkaTemplate.send(TOPIC, new User(name, "Developer", 50000));
        return "Message published";
    }
}
