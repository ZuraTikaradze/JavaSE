package ge.cu.edu.lambda.Example3;

// default - მეთოდის მაგალთი
class Dog implements Animal{

    @Override
    public void sound() {
        System.out.println("Dog sound !!!");
    }
}

public class Main {
    public static void main(String[] args) {

        Animal dog=new Dog();
        dog.test();
        dog.sound();

        Animal animal=()-> System.out.println("Hello");
        animal.sound();
    }
}
