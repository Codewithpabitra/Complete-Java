public class Overloading {
     // Method 1: no parameter
    void show() {
        System.out.println("Hello from show()");
    }

    // Method 2: one parameter
    void show(int a) {
        System.out.println("Value: " + a);
    }

    // Method 3: two parameters
    void show(int a, String b) {
        System.out.println("Value: " + a + " and Text: " + b);
    }

    public static void main(String[] args) {
        Overloading obj = new Overloading();
        
        obj.show();                  // calls method 1
        obj.show(10);                // calls method 2
        obj.show(20, "Java");        // calls method 3
    }
}
