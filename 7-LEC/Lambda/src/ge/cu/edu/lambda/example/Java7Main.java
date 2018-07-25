package ge.cu.edu.lambda.example;

public class Java7Main {
    public static void main(String[] args) {

        Cost testCost=new TestCostImpl();
        System.out.println(testCost.cost());


        // ანონიმური კლასის გამოყენებით
        Cost testAnonimousCost=new Cost() {
            @Override
            public double cost() {
                return 99.0;
            }
        };
        System.out.println(testAnonimousCost.cost());
    }
}
