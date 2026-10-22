import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = sc.nextLine().trim(); // using method chaining
        System.out.print("Business Name: ");
        String bName = sc.nextLine().trim();
        System.out.print("Business industry");
        String industry = sc.nextLine().trim();

        System.out.println("You are " + name + " with a business of " + industry + ", named as " + bName);

    }
}
