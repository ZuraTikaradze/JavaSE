package ge.cu.stream.characterStream;

import java.io.*;

/*
* მაგალითში განხილულია ტექტური ფაილიდან ინფორმაციის გადაწერა მეორე ტექტურ ფაილში
 */
public class Code2 {

    public static void main(String[] args) {

        // წავიკითხოთ ტექსტურ ფაილში ჩაწერილი ინფორმაცია და ჩავწეროთ მეორე ფაილში

        try (Reader reader = new FileReader("C:\\Users\\Zura\\Desktop\\CULAB\\text1.txt");
             Writer writer = new FileWriter("C:\\Users\\Zura\\Desktop\\CULAB\\hello_copy.txt")) {
            int read;

            while ((read = reader.read()) != -1) {
                writer.write(read);
            }

            System.out.println("ფაილი წარმატებით გადაიწერა !!!");
        } catch (IOException e) {
            System.out.println("შეცდომა ფაილის გადაწერის დროს !!!");
            e.printStackTrace();
        }

    }
}
