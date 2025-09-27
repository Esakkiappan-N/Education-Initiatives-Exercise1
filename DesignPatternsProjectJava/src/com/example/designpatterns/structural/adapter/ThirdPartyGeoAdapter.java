package com.example.designpatterns.structural.adapter;

public class ThirdPartyGeoAdapter implements GeoService {
    private final ThirdPartyGeoClient client = new ThirdPartyGeoClient();

    @Override
    public double[] lookupCoordinates(String place) {
        if (place == null || place.trim().isEmpty()) throw new IllegalArgumentException("place required");
        String result = client.getLocation(place);
        if (result == null) return new double[]{0.0,0.0};
        String[] parts = result.split(",");
        try {
            double lat = Double.parseDouble(parts[0]);
            double lon = Double.parseDouble(parts[1]);
            return new double[]{lat, lon};
        } catch (Exception e) {
            throw new RuntimeException("failed to parse coordinates", e);
        }
    }

    public static void demo() {
        System.out.println("Adapter demo: converting third-party API to our GeoService");
        GeoService service = new ThirdPartyGeoAdapter();
        double[] delhi = service.lookupCoordinates("Delhi");
        System.out.println("Delhi coords: " + delhi[0] + ", " + delhi[1]);
    }
}
