package com.example.designpatterns.creational.builder;

public class ReportDirector {
    public static void demo() {
        System.out.println("Builder demo: constructing a report via builder");
        Report report = new ReportBuilder()
                .title("Daily Telemetry")
                .addLine("All satellites nominal")
                .addLine("No critical events")
                .build();
        System.out.println(report);
    }
}
