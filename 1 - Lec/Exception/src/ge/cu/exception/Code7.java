package ge.cu.exception;
/*
* Zura Tikaradze 2018
* Throwing an Exception
* შეცდომს ხელოვნურად წარმოქმნა
*/
public class Code7 {
    public static void main(String args[]) {
        try {
            System.out.println("Before throw.");
            throw new ArithmeticException(); //მეთოდში ხელოვნურად გამოვისროლეთ შეცდომა
        } catch (ArithmeticException exc) {
            System.out.println("Exception caught.");
        }
        System.out.println("After try/catch block.");
    }
}
