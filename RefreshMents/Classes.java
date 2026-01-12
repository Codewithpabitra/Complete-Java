
public class Classes {

    public static void main(String[] args) {
//        int a = 90;
        Student rahul = new Student("Rahul Kumar", 21,99);
//        rahul.name = "rahul kumar";
//        rahul.marks = 90;
//        rahul.roll = 21;

        Student anotherStudent = new Student();
        System.out.println(anotherStudent.marks);
        System.out.println(anotherStudent.roll);
        System.out.println(anotherStudent.name);


//        System.out.println(rahul);

//        System.out.println(rahul.name);
//        System.out.println(rahul.roll);
//        System.out.println(rahul.marks);

//        rahul.printInfo();
//        System.out.println(rahul.getMarks());

        final Student kunal = new Student();
        kunal.name = "Kunal Bhai";
        kunal.marks = 90f;
        kunal.roll = 4;

        System.out.println(kunal.name);
        System.out.println(kunal.marks);
        System.out.println(kunal.roll);

        final int a = 90;
//        a = 89; // error // can't assign a value a final variable


        // similarly
//        kunal = new Student("another student", 89 , 34.89f); // error // can not assign to the final keyword assign variable



        // Wrapper Classes
//        float val = new Float(12.5f); // wrapper class






    }
}

class Student {
    int roll;
    String name;
    float marks;

    // constructor overloading
    // 1st constructor
    Student(String name, int rollNo, float totalMarks) {
        this.name = name;
        this.roll = rollNo;
        this.marks = totalMarks;
    }

    // 2nd constructor
    Student() {
        System.out.println("Hi the class is created using no argument constructor");
    }
    // 3rd constructor
    Student(String name) {
        this.name = name;
    }

    void printInfo() {
        System.out.println("THis is the info of the Student \n" + "Name : " + this.name + "Roll no : " + this.roll + "Total Marks : " + this.marks);
    }

    float getMarks () {
        return this.marks;
    }

    // like the destructor of the cpp here are garbage collector , but we can't clear the object manually it does automatically ,
    // but we can take actions after the objects are cleared from the heap memory

    @Override
    protected void finalize() throws Throwable {
        System.out.println("The object is cleared");
    }
}

