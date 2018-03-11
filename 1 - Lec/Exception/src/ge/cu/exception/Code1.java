package ge.cu.exception;
/*
* Zura Tikaradze 2018
* A Simple Exception Example
*/
class Code1 {
    public static void main(String args[]) {
        int nums[] = new int[4]; // მასივი სულ 4 ელემენტიანია შესაბამისად მაქსიმალური ინდექსი არის 3 - ი
        // try ბლოკში ვსვამთ იმ კოდის ფრაგმენტს რომელმაც სავარაუდოდ უნდა გამოისროლოს შეცდომე
        try {

            System.out.println("Before exception is generated.");
            nums[7] = 10;  // ამ შემთხვევაში კი მივმართავთ ინდექსით 7 ელემენტს რაც ისვრის შეცდომას
            System.out.println("this won't be displayed");  // ეს ტექსტი არ გამოჩნდება კონსოლზე რადგან წინა ხაზში გამოსროლილ შეცდომაზე მართვა გადაეცემა catch ბლოკს

        } catch (ArrayIndexOutOfBoundsException exc) { // catch ბლოკი ამუშავებს ინდექსის გადაცდენას
            System.out.println("Index out-of-bounds!");
        }

        System.out.println("After catch statement.");
    }
}