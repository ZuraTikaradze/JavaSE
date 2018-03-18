package ge.cu.stream.characterStream;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/*
* მაგალითში განხილულია ტექსტური ფაილიდან ინფორმაციის წაკითხვა და კონსოლზე გამოტანა
 */
public class Code1 {

    public static void main(String[] args) {

        // ნაკადის გახსნა
        try (Reader reader = new FileReader("C:\\Users\\ztikaradze\\Desktop\\CaucasusUniversity\\JAVA_1\\Java_By_Zura\\2\\LAB\\hello.txt")) {

            // ცვლადი წაკითხული მონაცემისთვის
            int read;

            // read() -მეთოდი აბრუნებს -1 -ს მაშინ რიცა წასაკითხი აღარაფერია
            // while იტრიალებს მანამ სანამ ფაილში არ წაიკითავს უკანასკნელ სიმბოლოს
            // წაკითხული მონაცემებს კი მიანიჭებს read ცვლადს
            while ((read = reader.read()) != -1) {
                // ვაკეთებს სიმბოლოში წარმოდგენას (დაყვანას)
                char c = (char) read;

                // ეკრანზე გამოგვაქვს თვითონ ეს სიმბოლო
                // ყოველგვარი ხაზის ჩამოსვლების (ln) გარეშე
                System.out.print(c);
            }

            // საბოლოოდ გამოვა ყოველი წაკითხული სიმბოლო ეკრანზე
            // ფაილის მთლიანი შიგთავსი ეკრანზე ისე გამოვა, როგორც
            // ფაილში წერია, თავისი ხაზის წყვეტებით, პრობელებით
            // და ა.შ... რადგან ხაზის წყვეტები და პრობელებიც სიმბოლოებია
            // და ისინიც იკითხება ფაილიდან

        } catch (IOException e) {
            System.out.println("ფაილის წაკითხვა ვერ ხერხდება !!!");
            e.printStackTrace();
        }

    }
}
