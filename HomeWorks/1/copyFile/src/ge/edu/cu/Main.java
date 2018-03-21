package ge.edu.cu;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        String copyPath = "C:\\Users\\Zura\\AppData\\Local\\Packages\\Microsoft.Windows.ContentDeliveryManager_cw5n1h2txyewy\\LocalState\\Assets";
        String pastPath = "C:\\Users\\Zura\\Desktop\\imgs";

        File copyFile = new File(copyPath);
        for (File currentFile : copyFile.listFiles()) {

            InputStream inputStream = new FileInputStream(currentFile);
            OutputStream outputStream = new FileOutputStream(pastPath + "\\" + currentFile.getName() + ".jpg");

            byte[] buffer = new byte[(int) currentFile.length()];
            inputStream.read(buffer);
            outputStream.write(buffer);

            System.out.println("ფაილი წარმატებით დაკოპირდა !");
        }

    }
}
