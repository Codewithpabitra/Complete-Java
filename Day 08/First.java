class Demo{
    int x;
}

public class First {

    public static void main(String[] args) {
//        int x = 12;
//        System.out.println(x); // 12
//        Name(x);
//        System.out.println(x); // 12

        Demo t = new Demo(); // object created
        t.x = 10;
        System.out.println("The value " + t.x); // 10
        modify(t);
        System.out.println("The value " + t.x); // 30




    }

    static void Name(int x) {
        x = 90;
        return;
    }

    static void modify(Demo t) {
        t.x = 30;
        return;
    }
}
