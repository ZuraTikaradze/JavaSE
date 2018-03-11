package ge.cu.exception;

/*
* Zura Tikaradze 2018
* Exception Type Mismatch
*/
class Code3 {
    public static void main(String args[]) {
        int nums[] = new int[4];
        try {
            System.out.println("Before exception is generated.");
            nums[7] = 10;  // კოდის ეს ფრაგმენტი გამოიწვევს შეცდომას რადგან არარსებულ ინდექსს მივმართავთ
            System.out.println("this won't be displayed");
        } catch (ArithmeticException exc) { // catch ბლოკი იჭერს მხოლოდ არითმეტიკულ შეცდომებს და არა ინდექსის გადაცდენას და ა.შ.. // შესაბამისად ვერ დაიჭერს ზემოთ წარმოქმნილ შეცდომას
            System.out.println("Index out-of-bounds!");
        }
        System.out.println("After catch statement.");
    }
}
