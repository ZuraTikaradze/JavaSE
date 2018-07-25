package ge.cu.edu.lambda.example2;

public class Java7Main {
    public static void main(String[] args) {
        Value value=new Value() {
            @Override
            public double getValue(double v) {
                return v/2;
            }
        };

        System.out.println(value.getValue(10));
    }
}
