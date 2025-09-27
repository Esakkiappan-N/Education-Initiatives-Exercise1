package com.example.designpatterns.creational.builder;

import java.time.Instant;

public class ReportBuilder {
    private String title = "Untitled";
    private StringBuilder body = new StringBuilder();
    private Instant createdAt = Instant.now();

    public ReportBuilder title(String t) {
        if (t == null || t.trim().isEmpty()) throw new IllegalArgumentException("title required");
        this.title = t; return this;
    }

    public ReportBuilder addLine(String line) {
        if (line == null) throw new IllegalArgumentException("line cannot be null");
        body.append(line).append('\n');
        return this;
    }

    public ReportBuilder createdAt(Instant instant) {
        if (instant == null) throw new IllegalArgumentException("createdAt cannot be null");
        this.createdAt = instant; return this;
    }

    public Report build() {
        return new Report(title, body.toString(), createdAt);
    }
}
