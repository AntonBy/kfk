package by.test.kfk.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfig {

    @Value("${app.kafka.topic.msg}")
    @Getter
    private String messageTopicName;



}
