public class Shadowing {
    static int x = 50;  // class variable (outer scope)

    public static void main(String[] args) {
        System.out.println("Before shadowing, x = " + x);

        int x = 100;  // local variable shadows the class variable
        System.out.println("After shadowing, x = " + x);
    }
}






// Armstrong Number and Prime Number checking done!