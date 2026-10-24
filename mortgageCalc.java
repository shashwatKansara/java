import java.text.NumberFormat;
import java.util.Scanner;

public class mortgageCalc {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Welcome to Mortgage Calculator!");
        System.out.print("Please enter your name ");
        String name = sc.nextLine();
        System.out.print("Please enter your principal amount");
        int principal = sc.nextInt();
        System.out.print("Enter the total duration");
        int period = sc.nextInt();
        System.out.print("Interest rate ");
        float interest = sc.nextFloat()/100;

        double monthlyRate = interest / 12;
        int numPayments = period * 12;
        double mortgage = principal * (monthlyRate * Math.pow(1+monthlyRate, numPayments))
                / (Math.pow(1+monthlyRate, numPayments)-1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage " + mortgageFormatted);


    }
}
