package by.test.kfk.controller;

import by.test.kfk.services.MessageService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/messages")
public class MessageController {

    private final MessageService messageService;

    @GetMapping("/send/{msg}")
    public void sendMessage(@PathVariable("msg") String message) {
        messageService.sendMessage(message);
    }

    @GetMapping
    public List<String> getAllMessages() {
        return messageService.getAllMessages();
    }

}
