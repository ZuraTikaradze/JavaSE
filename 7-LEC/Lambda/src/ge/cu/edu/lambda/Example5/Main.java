package ge.cu.edu.lambda.Example5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList=new ArrayList<>();

        personList.add(new Person("Giorgi",10));
        personList.add(new Person("Nino",20));
        personList.add(new Person("Nika",12));
        personList.add(new Person("Dato",35));

        // sort list by age // java 7

        Collections.sort(personList, new SortComperator()) ;

        //System.out.println(personList);

        // sort list by age // java 8 up
        Collections.sort(personList,(Person o1, Person o2)->o1.getAge() > o2.getAge() ? 1 : -1);
        System.out.println(personList);

    }
}
