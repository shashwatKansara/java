public class Main5 {
    int modelYear;
    String modelName;

    public Main5(String modelName, int modelYear) { // constructor with 2 parameters using 'this' keyword for special attribution
        this.modelName = modelName;
        this.modelYear = modelYear;
    }

    public void printInfo() {
        System.out.println(modelName + " " + modelYear);
    }
    public static void main(String[] args){
        Main5 car1 = new Main5("Bugatti Veyron", 2011);
        Main5 car2 = new Main5("Pagani Huayra", 2025);
        car1.printInfo();
        car2.printInfo();
    }
}
