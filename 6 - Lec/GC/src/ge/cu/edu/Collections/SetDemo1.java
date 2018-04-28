package ge.cu.edu.Collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo1 {
    public static void main(String[] args) {
        boolean[] myArray = new boolean[5];
        Set mySet = new HashSet();

        myArray[0] = mySet.add("a");
        myArray[1] = mySet.add(new Integer(42)); // შეინახება როგორც რიცხვი
        myArray[2] = mySet.add("b");
        myArray[3] = mySet.add("a"); // ar daamatebs radgan dublirdeba
        myArray[4] = mySet.add(new Object());
        for (int x = 0; x < myArray.length; x++)
            System.out.print(myArray[x] + " "); // ინდექსით 3-ზე დააბრუნებს false -ს რადგან არ დაემატება დუბლირების გამო
        System.out.println('\n'+"---------");

        for (Object o : mySet) // It's important to know that the order of objects printed in the second for loop is not predictable: HashSets do not guarantee any ordering
            System.out.println(o + " ");
    }
}
