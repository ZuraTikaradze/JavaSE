package ge.cu.edu.lambda.Example5;

import java.util.Comparator;

public class SortComperator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int result = 0;
        result = o1.getAge() > o2.getAge() ? 1 : -1; // zrdadobit alagebs , < klebadobit daalagebs
        return result;
    }
}
