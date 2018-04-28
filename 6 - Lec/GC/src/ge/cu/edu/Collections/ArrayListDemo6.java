package ge.cu.edu.Collections;

import java.util.*;

// Before Java 5 and the enhanced for loop, the most common way
// to examine a List "element by element" was through the use of an Iterator
class Dog {
    public String name;

    Dog(String n) {
        name = n;
    }
}

class ItTest {
    public static void main(String[] args) {
        List<Dog> d = new ArrayList<Dog>();
        Dog dog = new Dog("aiko");
        d.add(dog);
        d.add(new Dog("clover"));
        d.add(new Dog("magnolia"));

        Iterator<Dog> i3 = d.iterator(); // make an iterator
        while (i3.hasNext()) {
            Dog d2 = i3.next(); // cast not required
            System.out.println(d2.name);
        }
        System.out.println("size " + d.size());
        System.out.println("get1 " + d.get(1).name);
        System.out.println("aiko " + d.indexOf(dog));
        d.remove(2);
        Object[] oa = d.toArray();
        for (Object o : oa) {
            Dog d2 = (Dog) o;
            System.out.println("oa " + d2.name);
        }
    }
}

