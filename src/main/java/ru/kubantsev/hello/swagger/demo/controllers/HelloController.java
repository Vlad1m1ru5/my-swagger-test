package ru.kubantsev.hello.swagger.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.kubantsev.hello.swagger.demo.entities.Message;

@RestController
@RequestMapping(value = "hello")
public class HelloController {

    @GetMapping(
            value = "message",
            produces = "application/json")
    public Message getHelloMessage() {
        return new Message()
                .withText("Hello message");
    }

}
