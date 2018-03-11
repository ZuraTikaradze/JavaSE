package ge.cu.exception;
/*
* Zura Tikaradze 2018
* Catching Subclass Exceptions
* Throwable - ს ყველა შვილობილი კლასის ექსეფშენის დაჭერა
*/
public class Code5 {
    public static void main(String args[]) {
        int numer[] = {4, 8, 16, 32, 64, 128, 256, 512};
        int denom[] = {2, 0, 4, 4, 0, 8};
        for (int i = 0; i < numer.length; i++) {
            try {
                System.out.println(numer[i] + " / " + denom[i] + " is " + numer[i] / denom[i]);
            } catch (ArrayIndexOutOfBoundsException exc) {
                System.out.println("No matching element found.");
            } catch (Throwable exc) {  // ეს ქეჩი იჭერს ყველა ტიპის ექსეფშენს
                System.out.println("Some exception occurred.");
            }
        }
    }
}
