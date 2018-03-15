package ge.cu.edu.io;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        File myfile=new File("C:\\Users\\Zura\\Desktop\\CULAB");

        File fileList[] = myfile.listFiles();
        String inFile[]=null;

        for (File curentFile:fileList) {

            if(!curentFile.isFile()){
                inFile=curentFile.list();
            }
        }

        for (String fileName:inFile) {
            System.out.println(fileName);
        }
    }
}
