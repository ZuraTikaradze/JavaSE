package ge.cu.stream.serialization;

import java.io.Serializable;

public class Student implements Serializable {
    int id;
    String name;
    String surname;

    public Student(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    void showInfo(){
        System.out.println("Info : "+id+" "+name+" "+" "+surname);
    }
}
