package Automobile;

public class Mercedes extends Cars {
    private Boolean hasAMGpackage;
    public Mercedes(String modelName, String colour, int modelYear, boolean hasAMGpackage) {
        super (modelName, modelYear, colour);
        this.hasAMGpackage = hasAMGpackage;
    }

    public void activateSportsMode() {
        if (hasAMGpackage) System.out.println("AMG Sport Mode On");
        else System.out.println("No AMG Pack Installed");
    }
}
