package javabootcamp.OOP;



public class Main {

    public static void main(String[] args) {
//            int age = 23; // simple variable
//            Student st = new Student(); // Student object is created
//            System.out.println(st);
//        System.out.println(st.name);
//        System.out.println(st.roll);
//        System.out.println(st.cgpa);

//        st.name = "Pabitra";
//        System.out.println(st.name); // Pabitra
//        System.out.println(st.roll); // 0 // first of all it will go to the object then the class for accessing properties
//        st.cgpa = 9.8f;
//        System.out.println(st.cgpa);

//        Student ram = new Student(); // 'Student()' -> this is a constructor function , a special function which will run everytime you create a new object

//        ram.name = "Ramchandra";
//        ram.roll = 34;
//        System.out.println(ram.roll);
//        System.out.println(ram.name);
//        System.out.println(ram.cgpa);

//        ram.printName(); // calling the method
//        int rollOfTheObject = ram.yourRollNo();
//        System.out.println(rollOfTheObject);

//        Student st = new Student("Pabitra",12,9.8f);

//        System.out.println(st.name);
//        System.out.println(st.roll);
//        System.out.println(st.cgpa);
//
//        Student st2 = new Student("Rahul", 33, 7.9f);
//        System.out.println(st2.name);
//        System.out.println(st2.roll);
//        System.out.println(st2.cgpa);

//        int rollNo = st2.yourRollNo();
//        System.out.println(rollNo);
//        st2.printName();
//        st.printName();

        Student random = new Student("Pabitra Name",12, 5.89f);
//        random.name = "Rahul";
        Student newrandom = random;
        newrandom.name = "Rakesh";
        System.out.println(newrandom.name);
        System.out.println(random.name);

    }
}


class Student {
    int roll; // 0 -> 12
    String name; // null -> Ram
    float cgpa;

    Student(String name, int roll , float cgpa) {
        this.name = name;
        this.roll = roll;
        this.cgpa = cgpa;
    }

    void printName() { // this is a method of the class
        System.out.println("Your name is " + this.name);
    }

    int yourRollNo() {
        return this.roll;
    }
}

