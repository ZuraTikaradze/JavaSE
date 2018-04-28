package ge.cu.edu.Collections;

import java.util.ArrayList;
import java.util.List;
// arrayList -ის გამოყენება
// სტრინგ ტიპის სიის შექმნა
public class ArrayListDemo1 {
    public static void main(String[] args) {
        List<String> test = new ArrayList<String>(); // declare the ArrayList
        String s = "hi";
        test.add("string"); // add some strings
        test.add(s);
        test.add(s + s); // hihi - ს ჩაწერს სიაში
        System.out.println(test.size()); // use ArrayList methods
        System.out.println(test.contains(42));
        System.out.println(test.contains("hihi"));
        test.remove("hi");
        System.out.println(test.size());

    }
}
