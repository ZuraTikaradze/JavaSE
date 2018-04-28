package ge.cu.edu.Autoboxing;

public class Demo1 {
    public static void main(String[] args) {

        // intValue()
        Double d = 51.99;
        int i = d.intValue();
        System.out.println(i);

        Integer integer = new Integer(12);

        Double aDouble = new Double("25.4");

        printNumber(integer);

        System.out.println(aDouble + 5);

    }


    public static void printNumber(int a) {
        System.out.println(a);
    }
}
