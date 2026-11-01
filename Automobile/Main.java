package Automobile;

public class Main {
    public static void main(String[]args) {
        Mercedes m = new Mercedes("C-Class", "Black", 2025, true);
        System.out.println(m);
        m.start();
        m.activateSportsMode();
        m.setColour(" Matt White");
        System.out.println(m.getColour());
    }
}

