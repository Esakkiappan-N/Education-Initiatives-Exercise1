package com.example.designpatterns.behavioral.observer;

import java.util.logging.Logger;

public class GroundStation implements SatelliteObserver {
    private static final Logger logger = Logger.getLogger(GroundStation.class.getName());
    private final String name;

    public GroundStation(String name) {
        this.name = name;
    }

    @Override
    public void onStatusChange(String satelliteId, SatelliteStatus status) {
        logger.info("[" + name + "] Received status for " + satelliteId + ": " + status);
        if (status == SatelliteStatus.LOW_POWER) {
            logger.info("[" + name + "] Scheduling power-save manoeuvre for " + satelliteId);
        }
    }
}
