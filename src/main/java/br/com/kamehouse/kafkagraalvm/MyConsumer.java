package br.com.kamehouse.kafkagraalvm;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MyConsumer {

    @KafkaListener(topics = "teste")
    public void consumer(String body){
        System.out.println(body);
    }

}
