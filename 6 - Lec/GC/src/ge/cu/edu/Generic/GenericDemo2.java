package ge.cu.edu.Generic;

public class GenericDemo2 {
    public static void main(String[] args) {

        Pair<String, String> p1=new PairImpl<>();
        p1.setKey("Hello");
        p1.setValus("World");

        System.out.println(p1.getKey() + " " + p1.getValue());
    }
}
