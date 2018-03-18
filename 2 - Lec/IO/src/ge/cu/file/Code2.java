package ge.cu.file;

import java.io.File;

/*
* მაგალითში განხილულია  დირექტოდრიიდან ფაილების სიის ამოღება
*/
public class Code2 {
    public static void main(String[] args) {
        // შევქმნათ C:\Windows\debug კატალოგის შესაბამისი ობიექტი
        File windowsDebug = new File("C:\\Windows\\debug");

        // File კლასის list() მეთოდი აბრუნებს ამ დირექტორიაში
        // შემავალი ფაილების სახელების მასივს (String[])
        String[] list = windowsDebug.list();

        // File კლასის listFile() მეთოდი აბრუნებს ამ დირექტორიაში
        // შემავალი ფაილების  მასივს (File[])
        File[] listFiles = windowsDebug.listFiles();

        for (String fileName : list) {
            System.out.println(fileName);
        }
        System.out.println("------------------------");
        for (File file : listFiles) {
            System.out.print(file.isFile() ? "File" : "Directory ");
            System.out.println("Name : " + file.getName());
            System.out.println("Length : " + file.length());
        }
    }
}