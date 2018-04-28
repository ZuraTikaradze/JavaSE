package ge.cu.edu.Generic;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo3 {
    public static void main(String[] args) {
        Dog dog = new Dog("Jeka");
//        displayAnimal(dog);
        Cat cat = new Cat("Garfild");
        displayAnimal(cat);

        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Kangaroo());
        animalList.add(new Cat("Garfild3"));
        // animalList.add(new Dog("jeka")); jekas aq ver davamatebt radgan Animal -is shvilobili klasi ar aris  : (

        sumOfAnimals(animalList);

    }

    static <E extends Animal> void displayAnimal(E e) {
        System.out.println(e);
    }

    static void sumOfAnimals(List<?> animals) {
        System.out.println("sumOfAnimals metodidan : " + animals.size());
    }

    // igevea rac wina metodi ubralod gansxvavebuli sitaqsit
    static <T> void sumOfAnimals1(List<T> animals) {
        System.out.println("sumOfAnimals metodidan : " + animals.size());
    }
   // turame da detalurad  dagchirdat  : https://docs.oracle.com/javase/tutorial/java/generics/wildcardGuidelines.html


}






