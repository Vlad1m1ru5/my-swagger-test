package ru.kubantsev.hello.swagger.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import ru.kubantsev.hello.swagger.demo.enteties.Message;

@Controller(value = "hello")
public class Hello {

    @GetMapping(
            value = "message",
            produces = "application/json")
    public Message getMessage() {

        Message message = new Message().withText("Hello world");
        return message;
    }
}
