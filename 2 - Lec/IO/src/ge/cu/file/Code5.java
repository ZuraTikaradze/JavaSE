package ge.cu.file;

import java.io.File;
import java.io.FilenameFilter;

/*
მაგალითში დემონსტრირებულია ფაილების ფილტრაცია ანონიმური კლასების საშუალებით
 */
public class Code5 {
    public static void main(String[] args) {
        // ვქმნით ფაილის ობიექტს windows\system32 დირექტორიისათვის
        File file = new File("C:\\Windows\\System32");

        // ამ დირექტორიიდან მოგვაქვს ფაილების სახელების სია ჩვენს მიერ შექმნილი ფილტრით
        String[] fileNames = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                // საძიებო ფრაზა არის app - ი
                String searchKey = "app";
                // თუ ფაილის სახელის ასოებ-დაპატარავებული ვარიანტი იწყება ჩვენი საძებნი ფრაზით
                // მაშინ ბრუნდება true
                // თუ არა და false
                if (name.toLowerCase().startsWith(searchKey.toLowerCase())) {
                    return true;
                } else {
                    return false;
                }
                // ეს მთელი if კონსტრუქცია შესაძლო იყო ჩაგვეწერა ასე მოკლედ
                // return name.toLowerCase().startsWith(searchKey.toLowerCase());
            }
        });

        // ვბეჭდავთ შედეგს
        for (String fileName : fileNames) {
            System.out.println(fileName);
        }
    }
}
