package PrivateJets;

public class Main {
    public static void main(String[]args) {
        FlightConfig g650 = new FlightConfig(19, "Gulfstream G650", true, 90, 2, "TurboFan", false, false);
        FlightConfig falcon = new FlightConfig(16, "Dassault Falcon 7X", false, 50, 3, "TurboFan", true, false);
        FlightConfig king = new FlightConfig(9, "Beechcraft King Air", true, 500, 2, "TurboProp", false, true);

        FlightConfig[] fleet = {g650, falcon, king};

        g650.describe();
        g650.isWorking();
        g650.fueling();

        falcon.describe();
        falcon.isWorking();
        falcon.fueling();

        king.describe();
        king.isWorking();
        king.fueling();

    }

}
