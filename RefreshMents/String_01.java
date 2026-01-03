package javabootcamp.Refreshments;

import java.util.Scanner;

public class String_01 {
    public static void main(String[] args) {
        // strings are objects

        // string declaration
//        String name = "Pabitra";
//        String fullName = "Pabitra Maity";
//        String sentence = "My name is Pabitra Maity";

        Scanner in = new Scanner(System.in);
//        String name = in.nextLine();
//        System.out.println("Your name is " + name);

        // String in-build functions
        // concatenation
        String firstName = "Pabitra";
        String lastName = "Maity";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        //String length
        System.out.println(fullName.length());

        // charAt
        for (int i = 0; i < fullName.length(); i++) {
            System.out.print(fullName.charAt(i) + " ");
        }

        // compare string
        String name1 = "Tony";
        String name2 = "Tony";

        // s1 > s2 : +ve value
        // s1 == s2 : 0
        // s1 < s2 : -ve value
//        if (name1.compareTo(name2) == 0) {
//            System.out.println("Strings are equal");
//        }else {
//            System.out.println("String are not equal");
//        }

//        if(name1 == name2) {
//            System.out.println("they are equal");
//        }else {
//            System.out.println("they are not equal");
//        }

//        if(new String("Tony") == new String("Tony")) {
//            System.out.println("Strings are equal");
//        }else {
//            System.out.println("Strings are not equal");
//        }

        // substring -> substring(beg indx , end indx) -> end index is non-inclusive
        String sentence = "My name is Pabitra Maity";
        String name = sentence.substring(11,sentence.length());
//        System.out.println(name);
//
//        System.out.println(sentence.substring(5)); // by default last index is string.length()

        // strings are immutable


        // parsing in strings
        String random = "123";
        int number = Integer.parseInt(random);
        System.out.println(number);

        float floatNumber = Float.parseFloat(random);
        double doubleNumber = Double.parseDouble(random);
        long longNumber = Long.parseLong(random);

        System.out.println(floatNumber + " " + doubleNumber + " " + longNumber);

        String randomString = "12,23,10";
        String[] stringArr = randomString.split(",");
        int totalValue = Integer.parseInt(stringArr[0]) + Integer.parseInt(stringArr[1]) + Integer.parseInt(stringArr[2]);
        System.out.println("Total value = " + totalValue);

        in.close();

    }
}
