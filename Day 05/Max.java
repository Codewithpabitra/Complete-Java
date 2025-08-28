
import java.util.Scanner;

public class Max {

    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        int c = 30;

        Scanner in = new Scanner(System.in);
//        System.out.printf("Enter three numbers : ");
//
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//
//
//        int max = a;
//        if(b>max) {
//            max = b;
//        }
//        if (c > max) {
//            max = c;
//        }
//
//        System.out.printf("The max = " + max);


//        System.out.println(Math.max(23,Math.max(100,67))); // built-in methods

        // String input
//        String name = in.nextLine();
//        System.out.println(name);

        // character_input
        char ch = in.next().trim().charAt(0);
       if(ch >= 'a' && ch <='z') {
           System.out.println("lowercase");
       }else if(ch >= 'A' && ch <= 'Z') {
           System.out.println("uppercase");
       }else{
           System.out.println("another case");
       }


    }
}
