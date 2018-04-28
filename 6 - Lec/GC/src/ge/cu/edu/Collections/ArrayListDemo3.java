package ge.cu.edu.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// კოლექციების სორტირება
// Collections- კლასის სტატიკური მეთოდის გამოყენება
public class ArrayListDemo3 {
    public static void main(String[] args) {
        List<String> myList=new ArrayList<>();
        myList.add("B");
        myList.add("C");
        myList.add("A");


        Collections.sort(myList);
        System.out.println(myList);

    }
}
