package br.com.kamehouse.kafkagraalvm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportRuntimeHints;

@SpringBootApplication
@ImportRuntimeHints(value = MyHints.class)
public class KafkaGraalvmApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaGraalvmApplication.class, args);
    }

}
