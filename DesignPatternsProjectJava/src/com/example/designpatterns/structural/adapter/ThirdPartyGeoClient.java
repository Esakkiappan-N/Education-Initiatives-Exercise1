package com.example.designpatterns.structural.adapter;

// Simulated third-party client that has a different API
public class ThirdPartyGeoClient {
    public String getLocation(String place) {
        if (place == null) return null;
        switch (place.toLowerCase()) {
            case "delhi": return "28.7041,77.1025";
            case "bangalore": return "12.9716,77.5946";
            default: return "0.0,0.0";
        }
    }
}
