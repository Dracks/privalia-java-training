package com.privalia.springkafka.controllers;

import com.privalia.springkafka.consumer.Receiver;
import com.privalia.springkafka.producer.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kafka")
public class SpringKafkaController {

    @Value("${kafka.topic.helloworld}")
    private String topic;

    @Autowired
    private Sender sender;

    @Autowired
    private Receiver receiver;

    @RequestMapping(value = "/messages/", method = RequestMethod.GET, produces = "application/json")
    public List<String> getMessages(){
        return receiver.getReceiveMessagesList();
    }

    @RequestMapping(value="/messages/", method= RequestMethod.POST, produces="test/plain")
    public String createMessage(@RequestBody String message){
        sender.send(topic, message);
        return "Message: "+message;
    }
}
