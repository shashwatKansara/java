package PrivateJets;

public class FlightConfig extends Flights {
    private int engineCount;
    private String engineType;
    private boolean isTriJet;
    private boolean isHybridProp;
    // inheritance constructor

    public  FlightConfig( int numOfSeats, String modelName, boolean working, int fuel,
            int engineCount, String engineType, boolean isTriJet, boolean isHybridProp) {
        super(numOfSeats, modelName, working, fuel);
        this.engineCount = engineCount;
        this.engineType = engineType;
        this.isTriJet = isTriJet;
        this.isHybridProp = isHybridProp;
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("Engines: " + engineCount + " x" + engineType
        + (isTriJet ? "| Tri-Jet": "")
        + (isHybridProp ? "| Hybrid Propulsion": ""));
    }

}
