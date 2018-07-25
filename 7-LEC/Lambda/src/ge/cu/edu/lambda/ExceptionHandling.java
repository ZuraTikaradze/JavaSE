package ge.cu.edu.lambda;

interface TestE {
    int show(int x) throws Exception;
}

public class ExceptionHandling {
    public static void main(String[] args) {

        TestE testE = (x) -> 10 / x;


        try {
            System.out.println(testE.show(0));
        } catch (Exception e) {
            System.out.println("garet shecdoma");
        }

    }
}
