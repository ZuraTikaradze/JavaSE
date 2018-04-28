package ge.cu.edu.Generic;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo1 {
    public static void main(String[] args) {

        Box<String> myBox=new Box<String>();
        myBox.setObj("Hello");

        String str= myBox.getObj();

        System.out.println(str);

//        myBox.setObj(new Integer(10));  // Compile time error / რადგან მარტო სტრინგებს ინახავს ეს ობიექტი
//
//        int i= (int) myBox.getObj(); // ინტს არ აბრუნებს ეს გეთი აბრუნებს სტრინგს // აქაც ერორია .

//        System.out.println(i);


    }
}
