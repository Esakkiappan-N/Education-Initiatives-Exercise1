package com.example.designpatterns.creational.builder;

import java.time.Instant;

public class Report {
    private final String title;
    private final String body;
    private final Instant createdAt;

    public Report(String title, String body, Instant createdAt) {
        this.title = title;
        this.body = body;
        this.createdAt = createdAt;
    }

    public String getTitle() { return title; }
    public String getBody() { return body; }
    public Instant getCreatedAt() { return createdAt; }

    @Override
    public String toString() {
        return "Report{title='" + title + "', createdAt=" + createdAt + "}\n" + body;
    }
}
