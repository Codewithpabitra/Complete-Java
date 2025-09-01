public class Enhanced_Switch {
    public static void main(String[] args) {
        int day = 3;
        // String dayName;

        // switch (day) {
        //     case 1:
        //         dayName = "Monday";
        //         break;
        //     case 2:
        //         dayName = "Tuesday";
        //         break;
        //     case 3:
        //         dayName = "Wednesday";
        //         break;
        //     default:
        //         dayName = "Invalid";
        // }  


    

    String dayName = switch (day) {
        case 1 -> "Monday";
        case 2 -> "Tuesday";
        case 3 -> "Wednesday";
        default -> "Invalid";
    };

    System.out.println(dayName);

    } 


}
