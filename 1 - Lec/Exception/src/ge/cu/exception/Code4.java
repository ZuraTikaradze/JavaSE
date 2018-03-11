package ge.cu.exception;

/*
* Zura Tikaradze 2018
* Using Multiple catch Statements
* კოდის ამ ფრაგმენტში წარმოდგენილია რამოდენიმე ტიპის ექსეფშენის დამუშავება
*/
public class Code4 {
    public static void main(String args[]) {
        int numer[] = {4, 8, 16, 32, 64, 128, 256, 512};
        int denom[] = {2, 0, 4, 4, 0, 8};
        for (int i = 0; i < numer.length; i++) {
            try {
                System.out.println(numer[i] + " / " + denom[i] + " is " + numer[i] / denom[i]);
            } catch (ArithmeticException exc) { // ეს ქეჩ ბლოკი უზრუნველყობს ნულზე გაყოფის შეცდომის დამუშავებას
                System.out.println("Can't divide by Zero!");
            } catch (ArrayIndexOutOfBoundsException exc) { // ეს ქეჩ ბლოკი უზრუნველყობს მასივის არარსებულ ინდექსზე მიმართვის დამუშავებას
                System.out.println("No matching element found.");
            }
        }
    }

}
