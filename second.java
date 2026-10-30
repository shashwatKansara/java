public class second {
    public static void main(String[]args) {
        Main2 car1 = new Main2(); // has-a relationship (dependency); nothing like aggregation or inheritance
        car1.fullThrottle();
        car1.setMaxSpeed(250);
    }
}
