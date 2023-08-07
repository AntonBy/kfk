package by.test.kfk.services;

import by.test.kfk.config.KafkaConfig;
import by.test.kfk.repository.MemoryRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class MessageService {

    private final KafkaTemplate<String, String> template;
    private final KafkaConfig kafkaConfig;
    private final MemoryRepository memoryRepository;

    public void sendMessage(String message) {
        log.info("Send message: {}", message);
        template.send(kafkaConfig.getMessageTopicName(), message);
    }

    public List<String> getAllMessages() {
        return memoryRepository.findAll();
    }

    @KafkaListener(topics = "${app.kafka.topic.msg}")
    public void consumeMessage(String message) {
        log.info("New message arrived: {}", message);
        memoryRepository.save(message);
    }

}
