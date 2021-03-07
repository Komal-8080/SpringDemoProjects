package com.greetings.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="GREETINGS")
public class Greeting {

    @Id
    private final long id;
    private final String message;

    public Greeting() {
        id = 0;
        message = " ";
    }

    public Greeting(long id, String message) {
        this.id = id;
        this.message = message;
    }

    public long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }
}
