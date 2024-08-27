import java.util.Scanner;
public class  Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a scanner

        // Prompts the user to enter milliseconds
        System.out.print("Enter milliseconds: ");
        long millis = input.nextLong();

        // Converts milliseconds to hours, minutes, and seconds
        System.out.println("hours:minutes:seconds: " + convertMillis(millis));
    }

    // Method convertMillis converts milliseconds to hours, minutes and seconds
    public static String convertMillis(long millis) {
        // Gets total seconds
        millis /= 1000;

        // Obtain current minute and second
        String minuteAndSecond = "";
        // Reduces it down to hours and minutes with remainders
        for (int i = 0; i < 2; i++) {
            minuteAndSecond = ":" + millis % 60 + minuteAndSecond;
            millis /= 60;
        }
        return millis + minuteAndSecond;
    }
}