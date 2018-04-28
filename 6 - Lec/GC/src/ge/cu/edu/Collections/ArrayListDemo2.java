package ge.cu.edu.Collections;
// არაილისთის გამოყენება
//ვრაპერებით რიცხვითი ტიპის სიის შექმნა
// Diamond -სინტაქსი

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        List<Integer> myNumbers = new ArrayList<>();// <> - Dimond სინტაქსი, ანუ თუ წინ დავუწერთ ტიპს აღარ არის აუცილებელი მორედაც დავუკონკრეტოდ
        Integer a = 10;
        int b = 20;
        myNumbers.add(new Integer(10));
        myNumbers.add(a);
        myNumbers.add(b);// autoBoxing - ი მოხდა.

        for(int number : myNumbers){
            System.out.println(number);
        }
    }
}
