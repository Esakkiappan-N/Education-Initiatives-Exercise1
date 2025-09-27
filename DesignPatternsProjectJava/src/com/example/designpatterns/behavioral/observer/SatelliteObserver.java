package com.example.designpatterns.behavioral.observer;

public interface SatelliteObserver {
    void onStatusChange(String satelliteId, SatelliteStatus status);
}
