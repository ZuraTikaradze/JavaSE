package ge.cu.stream.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Code2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\ztikaradze\\Desktop\\CaucasusUniversity\\JAVA_1\\Java_By_Zura\\2\\stext.txt");

        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Student student= (Student) objectInputStream.readObject();

        System.out.println(student.id + " " + student.name+" "+student.surname);
        student.showInfo();

        objectInputStream.close();
    }
}
