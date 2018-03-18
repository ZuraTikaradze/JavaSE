package ge.cu.stream.ByteStream;

import java.io.*;
/*
* კოდის ამ ფრაგმენტში განხილულია ფაილის კოპირების მაგალითი java 1.6 -ზე და უფრო ძველ ვერსიებზე
*/
public class Code1 {
    public static void main(String[] args) {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        // ეს ფაილი გვინდა რომ
        File file = new File("C:\\CaucasusUniversity\\image.jpg");

        // დავაკოპიროთ ამ ფაილში
        File file2 = new File("C:\\image.jpg");

        // 1. Open
        // ვხსნით პროგრამაში შემომავალ ნაკადს პირველი ფაილიდან
        // და პროგრამიდან გამავალ ნაკადს მეორე ფაილისკენ
        try {
            inputStream = new FileInputStream(file);
            outputStream = new FileOutputStream(file2);

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
            System.out.println("შეცდომა ფაილის კოპირების დროს ! ! !");
            e.printStackTrace();
        } finally {  // 3. Close
            try {
                inputStream.close();
                outputStream.close();
            } catch (IOException e) {
                System.out.println("შეცდომა ნაკადის დახურვის დროს !!!");
                e.printStackTrace();
            }
        }
    }
}
