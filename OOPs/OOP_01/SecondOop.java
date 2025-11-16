package javabootcamp.OOP;

public class SecondOop {

    public static void main(String[] args) {
//        int a = 12;
//        YourStudent st1 = new YourStudent("Alexa", 23, 'G');
//        st1.name = "Pabitra";
//        st1.div = 'D';

//        YourStudent st2 = new YourStudent("John", 34, 'D');

//
//        System.out.println(st2.name);
//        System.out.println(st2.roll);
//
//        st2.changeRoll(45);
//        System.out.println(st2.roll);
//        YourStudent newStudent = st1;
//        newStudent.name = "Katrina";
//        System.out.println(newStudent.name);
//        System.out.println(st1.name);


//        YourStudent student = new YourStudent("Pabitra", 89, 'L');
//
//        System.out.println(student.name);
//        System.out.println(student.roll);
//        System.out.println(student.div);

        // Wrapper classes

//        int a = 34;
//        Integer b = 23;
//        Float c;
//        c = 23.5f;
//        System.out.println(c);

//        final int a = 90; // int is a primitive datatypes
//
//       final YourStudent st = new YourStudent();
//       st.name = "HexaFalls"; // you can do this
//        System.out.println(st.name);

//        YourStudent stNew = new YourStudent();

//        st = stNew; // you can't do this (Error)



        // grabage collection clear 
        for(int i=0;i<1000000000;i++) {
            YourStudent st = new YourStudent();
        }


    }
}


class YourStudent {
    String name = "Harry";
    int roll;
    char div;

    YourStudent (String name, int roll, char div) {
        this.name = name;
        this.roll = roll;
        this.div = div;
    }

    YourStudent() {
        this.name = "Pabitra";
        this.roll = 12;
        this.div = 'H';
    }


    String printName() {
       return this.name;
    }


    int changeRoll(int newRoll) {
        this.roll = newRoll;
        return this.roll;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage cleaning");
    }
}

