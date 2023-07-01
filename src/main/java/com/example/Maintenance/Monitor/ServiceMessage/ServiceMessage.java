package com.example.Maintenance.Monitor.ServiceMessage;

import org.springframework.stereotype.Component;

@Component
public class ServiceMessage {
    private String content;

    public ServiceMessage() {
        this.content = "Everything operates as expected";
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void reset() {
        this.content = "Everything operates as expected";
    }
}
