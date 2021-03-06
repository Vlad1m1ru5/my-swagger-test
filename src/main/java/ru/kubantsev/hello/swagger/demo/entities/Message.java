package ru.kubantsev.hello.swagger.demo.entities;

import java.io.Serializable;

public class Message implements Serializable {

    public Message() {};

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Message withText(String text) {
        setText(text);
        return this;
    }
}
