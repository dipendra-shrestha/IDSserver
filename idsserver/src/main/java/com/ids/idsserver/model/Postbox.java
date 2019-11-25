package com.ids.idsserver.model;

import org.springframework.stereotype.Component;

@Component
public class Postbox {
    boolean available;
    String message;

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
