package ge.cu.exception;
/*
* Zura Tikaradze 2018
* Finally Operator
* კოდის ფრაგმენტი რომელიც სრულდება ნებისმიერ შემთხვევაში იმისდამიუხედავად გამოვლინდა თუ არა შეცდომა.
*/
class Code9 {
    public static void main(String args[]) {
        try {
            System.out.println("Before throw.");
            throw new ArithmeticException(); // გამოვისროლედ შეცდომა
        } catch (ArithmeticException exc) { // დავიჭირეთ და დავამუშავედ
            System.out.println("Exception caught.");
        } finally { // ამ ბლოკში მოთავსებული კოდი ყველა შემთხვევაში სრულდება
            System.out.println("Important Code");
        }
        System.out.println("After try/catch block.");
    }
}
