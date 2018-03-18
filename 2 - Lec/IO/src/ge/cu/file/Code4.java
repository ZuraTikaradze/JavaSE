package ge.cu.file;

import java.io.File;
import java.io.FileFilter;

class MegabyteFilter implements FileFilter {

    @Override
    public boolean accept(File pathname) {
        // მინიმალური ზომა ბაიტებში
        // ანუ 1024 ბაიტი არის ერთი კილობაიტი
        // ხოლო 1024 კილობაიტი კი ერთი მეგაბაიტი
        long minSizeOfResource = 1024 * 1024;

        if (pathname.length() >= minSizeOfResource) {
            return true;
        } else {
            return false;

        }

        // ექვივალენტი:
        // return pathname.length() >= minSizeOfResource;

    }
}
public class Code4 {
    public static void main(String[] args) {
        // ვქმნით ფაილის ობიექტს windows\system32 დირექტორიისათვის
        File file = new File("C:\\Windows\\System32");

        // ამ დირექტორიიდან მოგვაქვს ფაილების სახელების სია ფილტრით
        File[] files = file.listFiles(new MegabyteFilter());

        // ვბეჭდავთ შედეგს
        for (File currentfile : files) {
            double currentFileMB=(double)currentfile.length()/1024/1024;
            System.out.println(currentfile.getName()+" - "+currentFileMB);
        }
    }
}
