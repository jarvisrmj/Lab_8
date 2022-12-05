import java.util.Scanner;

public class FavNum {
    public static void main(String[] args) {
        int integerNumber;
        double doubleNumber;

        Scanner in = new Scanner(System.in);

        integerNumber = SafeInput.getInt(in, "What is your favorite integer?");
        doubleNumber = SafeInput.getDouble(in, "What is your favorite non-integer?");

        System.out.println("");
        System.out.println("\nYour favorite integer is: " + integerNumber);
        System.out.println("\nYour favorite non-integer is: " + doubleNumber);
    }
}