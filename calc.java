import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Calculator ---");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Subtract");
            System.out.println("4. Multiply");
            System.out.println("5. Exit");
            System.out.println("Enter Choice: ");
            choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Goodbye. ");
            }
            if (choice < 1 || choice > 5) {
                System.out.println("Invalid choice, try again. ");
            }
            System.out.print("Enter first number: ");
            double a = sc.nextDouble();
            System.out.print("Enter second number");
            double b = sc.nextDouble();

            switch(choice) {
                case 1:
                    System.out.println("Result: " + (a+b));
                break;
                case 2:
                    System.out.println("Result: " + (a-b));
                break;
                case 3:
                    System.out.println("Result: " + (a * b));
                break;
                case 4:
                    if (b == 0){
                        System.out.print("Error: cannot divide by 0");
                    } else {
                        System.out.println("Result: " + ( a / b));
                    } break;
            }
        } while (choice != 5);
        sc.close();
    }
}
