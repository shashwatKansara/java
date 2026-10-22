public class math {
    public static void main(String [] args) {
        // multiple mathematical methods:
        int result1 = Math.round(98.73F);
        System.out.println(result1);

        int age = (int)Math.ceil(18.6); // explicitly cast the double 18.6 into an integer
        System.out.println(age);

        int result2 = Math.max(23,55);
        System.out.println(result2);

        double result3 = Math.random();
        System.out.println(result3);
    }
}
