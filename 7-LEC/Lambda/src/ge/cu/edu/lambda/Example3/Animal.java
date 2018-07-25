package ge.cu.edu.lambda.Example3;

public interface Animal {
    void sound();
    default void test(){
        System.out.println("This is just an example of ***default*** method  ! ! !");
    }

}
