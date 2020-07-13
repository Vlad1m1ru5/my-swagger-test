package ru.kubantsev.hello.swagger.demo.enteties;

import java.io.Serializable;

public class Message implements Serializable {

    public Message(){};

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Message withText(String text) {
        this.text = text;
        return this;
    }
}
