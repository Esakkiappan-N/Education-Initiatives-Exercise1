package com.example.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class Satellite {
    private static final Logger logger = Logger.getLogger(Satellite.class.getName());
    private final String id;
    private SatelliteStatus status;
    private final List<SatelliteObserver> observers = Collections.synchronizedList(new ArrayList<>());

    public Satellite(String id) {
        if (id == null || id.trim().isEmpty()) throw new IllegalArgumentException("satellite id required");
        this.id = id;
        this.status = SatelliteStatus.OK;
    }

    public String getId() { return id; }

    public SatelliteStatus getStatus() { return status; }

    public void setStatus(SatelliteStatus status) {
        if (status == null) throw new IllegalArgumentException("status cannot be null");
        this.status = status;
        logger.info("Satellite " + id + " status changed to " + status);
        notifyObservers();
    }

    public void addObserver(SatelliteObserver observer) {
        if (observer == null) throw new IllegalArgumentException("observer cannot be null");
        observers.add(observer);
    }

    public void removeObserver(SatelliteObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        synchronized (observers) {
            for (SatelliteObserver o : observers) {
                try {
                    o.onStatusChange(id, status);
                } catch (Exception e) {
                    logger.warning("Observer callback failed: " + e.getMessage());
                }
            }
        }
    }
}
