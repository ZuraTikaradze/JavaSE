package ge.cu.edu.Collections;

public class DVDInfo implements Comparable{
    String title;
    String genre;
    String leadActor;

    DVDInfo(String t, String g, String a) {
        title = t;
        genre = g;
        leadActor = a;
    }

    public String toString() {  // ეს როაგ გადავტვირთო მაშნ DVDINFO პირდაპირ sout - ში ჩაწერის დროს ექსეფშენს ისვრის.
        return title + " " + genre + " " + leadActor + "\n";
    }

    @Override
    public int compareTo(Object o) { // piradpuir genericit xoar gavaketoo ?????
        DVDInfo dvdInfo=(DVDInfo) o; // ესე ვაკეთებთ მანამდე სანამ Generic -ებს არ გავივლით
        return title.compareTo(dvdInfo.title); // TITLE შეცვალეთ leadActor -ით ექსპერიმენტისთვის.
    }
}
