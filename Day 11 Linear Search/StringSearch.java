package javabootcamp.ArrayProblems;

public class StringSearch {

    public static void main(String[] args) {

        String str = "Pabitra";

        char target = 'b';

        for(int i=0;i<str.length();i++) {
            if(str.charAt(i) == target) {
                System.out.println("Found");
            }
        }

        System.out.println("Not found");

    }
}
