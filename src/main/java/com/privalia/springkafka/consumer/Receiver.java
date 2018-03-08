package com.privalia.springkafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

@Slf4j
public class Receiver {

    private ArrayList<String> receiveMessagesList = new ArrayList<>();

    private CountDownLatch latch = new CountDownLatch(1);

    public CountDownLatch getLatch(){
        return latch;
    }

    @KafkaListener(topics="${kafka.topic.helloworld}")
    public void receive(String payload){
        log.info("Received payload='{}", payload);
        receiveMessagesList.add(payload);
        latch.countDown();
    }

    public ArrayList<String> getReceiveMessagesList(){
        return this.receiveMessagesList;
    }

}
