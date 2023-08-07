package by.test.kfk.repository;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MemoryRepository {
    private final List<String> messages = new ArrayList<>();

    public void save(String message) {
        messages.add(message);
    }

    public List<String> findAll() {
        return new ArrayList<>(messages);
    }

}
