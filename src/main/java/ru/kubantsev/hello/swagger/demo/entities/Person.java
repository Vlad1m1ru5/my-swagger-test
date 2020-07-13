package ru.kubantsev.hello.swagger.demo.entities;

import java.io.Serializable;

public class Person implements Serializable {

    public Person() {};

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Person withId(Integer id) {
        setId(id);
        return this;
    }

}
