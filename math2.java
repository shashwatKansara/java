import java.text.NumberFormat;

public class math2 {
    // formating numbers
    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234567.891);
        System.out.println(result);

        String result2 = NumberFormat.getPercentInstance().format(0.5);
        System.out.println(result2);
    }
}
