package ge.cu.edu.Collections;

import java.util.Arrays;
import java.util.List;

public class ArrayListDemo5 {
    public static void main(String[] args) {

        String[] myArray = {"one", "two", "three", "four"};
        List myList = Arrays.asList(myArray); // make a List

        System.out.println("List size " + myList.size());
        System.out.println("Index[2] " + myList.get(2));

        myList.set(3, "six"); // change List
        myArray[1] = "five"; // change array

        System.out.println("-----------------");

        for (String arrayElement : myArray)
            System.out.println(arrayElement);

        System.out.println("-----------------");

        System.out.println("\nsl[1] " + myList.get(1));
    }
}
