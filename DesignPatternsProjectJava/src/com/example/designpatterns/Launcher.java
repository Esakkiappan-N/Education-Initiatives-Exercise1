package com.example.designpatterns;

import com.example.designpatterns.behavioral.observer.SatelliteController;
import com.example.designpatterns.behavioral.strategy.PaymentContext;
import com.example.designpatterns.creational.factory.NotificationFactory;
import com.example.designpatterns.creational.builder.ReportDirector;
import com.example.designpatterns.structural.adapter.ThirdPartyGeoAdapter;
import com.example.designpatterns.structural.facade.TelemetryFacade;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Launcher {
    private static final Logger logger = Logger.getLogger(Launcher.class.getName());

    public static void main(String[] args) {
        logger.info("Starting DesignPatternsProject Launcher");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            boolean running = true;
            while (running) {
                printMenu();
                String input = reader.readLine();
                if (input == null) break; // EOF
                input = input.trim().toLowerCase();
                switch (input) {
                    case "1":
                        SatelliteController.demo();
                        break;
                    case "2":
                        PaymentContext.demo();
                        break;
                    case "3":
                        NotificationFactory.demo();
                        break;
                    case "4":
                        ReportDirector.demo();
                        break;
                    case "5":
                        ThirdPartyGeoAdapter.demo();
                        break;
                    case "6":
                        TelemetryFacade.demo();
                        break;
                    case "help":
                        printMenu();
                        break;
                    case "exit":
                        running = false;
                        break;
                    default:
                        System.out.println("Unknown option. Type 'help' to show menu or 'exit' to quit.");
                }
            }
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Unexpected error in Launcher", e);
        }
        logger.info("Launcher shutting down gracefully.");
    }

    private static void printMenu() {
        System.out.println("\\n=== Design Patterns Demo Menu ===");
        System.out.println("1) Behavioral - Observer (Satellite Status Monitor)");
        System.out.println("2) Behavioral - Strategy (Payment Strategy)");
        System.out.println("3) Creational - Factory Method (Notifications)");
        System.out.println("4) Creational - Builder (Report Builder)");
        System.out.println("5) Structural - Adapter (Geo Adapter)");
        System.out.println("6) Structural - Facade (Telemetry Facade)");
        System.out.println("Type option number, 'help' to show menu, or 'exit' to quit.");
        System.out.print("-> ");
    }
}
