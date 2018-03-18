package ge.cu.stream.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Code1 {

    public static void main(String[] args) throws IOException {

        Student student =new Student(1,"Zura","Tikaradze");

        FileOutputStream fileOutputStream=new FileOutputStream("C:\\Users\\ztikaradze\\Desktop\\CaucasusUniversity\\JAVA_1\\Java_By_Zura\\2\\stext.txt");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(student);
        objectOutputStream.flush();

        System.out.println("success");
    }
}
