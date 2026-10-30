public class Main3 {
    int modelYear;
    String modelName;

    public Main3(int year, String name) { // can parameterize with different variable name and pair it with
        // previously declared fields.
        modelYear = year;
        modelName = name;

    }
    public static void main(String[] args) {
        Main3 myCar = new Main3(1979, "Lada ");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}
