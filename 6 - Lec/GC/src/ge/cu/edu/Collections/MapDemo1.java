package ge.cu.edu.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// HashMap -ის გამოყენება
// და მნიშნელობების დაბეჭვდა
public class MapDemo1 {
    public static void main(String[] args) {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "DOG");
        myMap.put(2, "CAT");

        Set<Integer> keys = myMap.keySet(); // აბრუნებს key  - ებს და ამის მიხედვით ვაბრუნებ შემდგომში value-ს

        for (Integer i : keys) {
            System.out.println(myMap.get(i));
        }
    }
}
