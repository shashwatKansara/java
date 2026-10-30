package Automobile;

public class Cars {
    private String modelName;
    private int modelYear;
    private String colour;

    public Cars(String modelName, int modelYear, String colour) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.colour = colour;
    }

    public void setName(String name) {
        this.modelName = name;
    }
    public void setColour(String cCar) {
        this.colour = cCar;
    }
    public void setYear(int year) {
        this.modelYear = year;
    }
    public String getName() {
        return modelName;
    }
    public String getColour(){
        return colour;
    }
    public int getModelYear() {
        return modelYear;
    }
    public void start() {
        System.out.println(modelName + " is starting..");
    }


}
