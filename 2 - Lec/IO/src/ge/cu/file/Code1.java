package ge.cu.file;

import java.io.File;
import java.io.IOException;

/*
* მაგალითში განხილულია File კლასის რამოდენიმე მეთოდი
*/
public class Code1 {
    public static void main(String[] args) {
        // სტრიქონში '\' სიმბოლოს გამოყენება იწვევს პრობლემებს, რადგან
        // ეს სიმბოლო სხვა სიმბილოებთან ერთად ერთიანდება (მაგ '\n', '\t'...)
        // ამიტომ, თუ გვინდა მისი გამოყენება, უნდა გამოვიყენოთ ორმაგი '\\'
        // სიმბოლო. ან, ფაილის მისამართისათვის ასევე შეიძლება '/'-ს გამოყენებაც
        File myTextFile = new File("C:\\Users\\ztikaradze\\Desktop\\CaucasusUniversity\\JAVA_1\\Java_By_Zura\\2\\LAB\\test.txt");
        File myNonExistentFile = new File("D:\\qweasd.zxc");
        File myDirectory = new File("C:");

        // ქმნის ახალ ფაილს. ისვრის IOException, თუ ვერ მოახერხა ის
        try {
            myTextFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // არსებობს თუ არა  ფაილი
        System.out.println(myTextFile.exists()); // true
        System.out.println(myNonExistentFile.exists()); // false
        System.out.println(myDirectory.exists()); // true

        // არის თუ არა ობიექტი ფაილი
        System.out.println(myTextFile.isFile()); // true
        System.out.println(myNonExistentFile.isFile()); // false
        System.out.println(myDirectory.isFile()); // false

        // არის თუ არა ობიექტი დირექტორია (კატალოგი/ფოლდერი)
        System.out.println(myTextFile.isDirectory()); // false
        System.out.println(myNonExistentFile.isDirectory()); // false
        System.out.println(myDirectory.isDirectory()); // true

        // შეიძლება თუ არა ფაილიდან წაკითხვა
        System.out.println(myTextFile.canRead()); // true

        // შეიძლება თუ არა ფაილში ჩაწერა
        System.out.println(myTextFile.canWrite()); // true

        // ფაილის ზომა ბაიტებში
        System.out.println(myTextFile.length()); // 0

        // ფაილის სახელი
        System.out.println(myTextFile.getName()); // f1.txt

        // ფაილის სრული სახელი (მისამართი)
        System.out.println(myTextFile.getPath()); // D:\f1.txt

        // ფაილის მშობელი კატალოგის სახელი (როგორც String)
        System.out.println(myTextFile.getParent()); // D:\

        // ფაილის მშობელი კატალოგი (როგორც File)
        System.out.println(myTextFile.getParentFile()); // D:\

        // ფაილის წაშლა (ასევე აბრუნებს boolean - მოხერხდა წაშლა თუ არა)
        System.out.println(myTextFile.delete()); // true


        // ეს ფაილი ჯერ არ არსებობს, მაგრამ გვინდა მის ადგილას
        // დირექტორიის შექმნა. ჯერ შევქმნათ ობიექტი.
        File createDir = new File("D:/my_java_dir");

        // ობიექტის შექმნისას ფაილურ სისტემაში მისი ფაილი არ არსებობს
        System.out.println(createDir.exists()); // false

        // ვქმნით დირექტორიას
        createDir.mkdir();

        // ვამოწმებთ
        System.out.println(createDir.exists()); // true
        System.out.println(createDir.isDirectory()); // true

        // ვშლით დირექტორიას
        createDir.delete();

        // ვამოწმებთ
        System.out.println(createDir.exists()); // false

    }
}