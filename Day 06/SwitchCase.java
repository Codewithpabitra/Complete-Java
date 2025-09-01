
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

//        for(int i=0;i<5;i++) { // nested loop
//            for(int j=0;j<7;j++) {
//                for() {
//
//                }
//                System.out.println("hello");
//            }
//        }

//        if(age > 18) { // nesting
//            if(age > 10) {
//                if(day > 8) {
//
//                }else{
//
//                }
//            }else {
//
//            }
//        }

        int day = in.nextInt(); // int

        String title = in.next(); // string


//        title.equals()
//        ==

//                name = "pabitra"
//                name2 = "pabitra"
//        if(name == name2) {
//
//        }

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                switch (title) {
                    case "maity":
//                        switch () // more nesting can be done
                        System.out.println("Title is Maity");
                        break;
                    case "das" :
                        System.out.println("Title is das");
                        break;

                }
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("no cases matched");
        }
    }

    
}
