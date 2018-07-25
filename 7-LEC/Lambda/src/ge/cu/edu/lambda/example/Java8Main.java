package ge.cu.edu.lambda.example;

public class Java8Main {
    public static void main(String[] args) {

        Cost testCost = () -> 99.9;
        System.out.println(testCost.cost());
    }
}
