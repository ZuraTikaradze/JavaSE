package ge.cu.edu.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        List<DVDInfo> dvdList = new ArrayList<>();
        dvdList.add(new DVDInfo("AMovie","Drama","BName"));
        dvdList.add(new DVDInfo("CMovie","Drama","AName"));
        dvdList.add(new DVDInfo("BMovie","Drama","CName"));


        Collections.sort(dvdList);

        System.out.println(dvdList);
    }
}
