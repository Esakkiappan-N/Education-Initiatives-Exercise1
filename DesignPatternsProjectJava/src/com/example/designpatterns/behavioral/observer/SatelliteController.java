package com.example.designpatterns.behavioral.observer;

public class SatelliteController {
    public static void demo() throws InterruptedException {
        Satellite sat = new Satellite("SAT-1");
        GroundStation gs1 = new GroundStation("GS-North");
        GroundStation gs2 = new GroundStation("GS-South");
        sat.addObserver(gs1);
        sat.addObserver(gs2);

        System.out.println("Observer demo: changing satellite status...");
        sat.setStatus(SatelliteStatus.LOW_POWER);
        Thread.sleep(200);
        sat.setStatus(SatelliteStatus.OFFLINE);

        sat.removeObserver(gs2);
        System.out.println("Removed GS-South. Changing back to OK...");
        sat.setStatus(SatelliteStatus.OK);
    }
}
