package javabootcamp;

import java.util.ArrayList;
import java.util.Scanner;

public class DemoList {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // to avoid fixed size of the array
        ArrayList<Integer> list = new ArrayList<Integer>(3);

        for(int i=0;i<5;i++) {
            list.add(in.nextInt());
        }

        list.set(0,88); // set(index,ele)  // update the value of the list
        list.remove(3); // to remove ele of the 3rd index
        System.out.println(list);
        System.out.println(list.get(2)); // get(10) -> error -> out of bound // arr[index] -> list.get(index)✅ list[index] ❌

    }
}
