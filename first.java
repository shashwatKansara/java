import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        int[] array = {22,41,21,34,52,10,19,24,31,39};
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        int average = sum / 10;
        System.out.println("Total of all numbers in the array are: " + sum);
        System.out.println("Array average is: " + average);
    }
}