package ge.cu.stream.ByteStream;

import java.io.*;
/*
* კოდის ამ ფრაგმენტში განხილულია ფაილის კოპირების მაგალითი java 1.7 -ზე და უფრო ახალ ვერსიებზე
*/
public class Code2 {
    public static void main(String[] args) {
        // ეს ფაილი გვინდა რომ
        File file = new File("C:\\Users\\ztikaradze\\Desktop\\CaucasusUniversity\\JAVA_1\\Java_By_Zura\\2\\LAB\\image.jpg");

        // დავაკოპიროთ ამ ფაილში
        File file2 = new File("C:\\Users\\ztikaradze\\Desktop\\CaucasusUniversity\\JAVA_1\\Java_By_Zura\\2\\image.jpg");
        // 1. Open
        // ვხსნით პროგრამაში შემომავალ ნაკადს პირველი ფაილიდან
        // და პროგრამიდან გამავალ ნაკადს მეორე ფაილისკენ
        try (InputStream inputStream = new FileInputStream(file);
             OutputStream outputStream = new FileOutputStream(file2)) {

            // 2. Work
            // ვამზადებთ ბაიტების მასივს ფაილის შიგთავსის შესანახად
            // ბაიტების მასივში იმდენი ბაიტი გვინდა რამდენიც, რა თქმა უნდა,
            // არის ფაილის ზომაში (ანუ file.length())
            // (ვინაიდან ეს აბრუნებს long-ს, ჩვენ გვჭირდება დაყვანა)
            byte[] buffer = new byte[(int) file.length()];

            // პირველი ფაილის ნაკდადიდან ვკითხულობთ ინფორმაციას და ვინახავთ მასივში
            inputStream.read(buffer);

            // შენახული ინფორმაციის მასივი გაგვაქვს მეორე ნაკადში
            outputStream.write(buffer);

            System.out.println("ფაილი წარმატებით დაკოპირდა !!!");
        } catch (IOException e) {
            System.out.println("შეცდომა ფაილის კოპირების დროს !!!");
            e.printStackTrace();
        }
        // 3. Close
        // აქ Java 7-ის try-with-resources ბლოკი ავტომატურად დახურავს
        // ზემოთ ფრჩხილებში მითითებულ ნაკადებს

    }
}
