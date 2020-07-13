package ru.kubantsev.hello.swagger.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.kubantsev.hello.swagger.demo.entities.Message;

@RestController
@RequestMapping(value = "invisible")
public class InvisibleController {

    @GetMapping(
            value = "message",
            produces = "application/json")
    public Message getInvisibleMessage() {
        return new Message()
                .withText("Invisible message");
    }
}
