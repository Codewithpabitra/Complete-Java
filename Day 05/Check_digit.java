
import java.util.Scanner;

public class Check_digit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = in.nextInt();

        System.out.print("Enter the digit to be counted : ");
        int digit = in.nextInt();
        int count = 0;
        while (number> 0) {
            int rem = number % 10;
            if(rem == digit) {
                count++;
            }

            number = number / 10; // number /= 10;

        }

        System.out.println("The count of the digit = " + count);
    }
}
