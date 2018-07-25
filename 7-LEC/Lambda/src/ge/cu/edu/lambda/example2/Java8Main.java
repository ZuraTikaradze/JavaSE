package ge.cu.edu.lambda.example2;

public class Java8Main {
    public static void main(String[] args) {
        Value value = (v)-> 2.5 / v;
//        Value value = (double v)-> 2.5 / v;

        System.out.println(value.getValue(10));

    }
}
