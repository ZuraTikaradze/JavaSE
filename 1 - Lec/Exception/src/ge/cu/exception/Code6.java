package ge.cu.exception;
/*
* Zura Tikaradze 2018
* Try Blocks Can Be Nested
* ჩადგმული ქეჩ ბლოკი
*/
public class Code6 {
    public static void main(String args[]) {
        int numer[] = {4, 8, 16, 32, 64, 128, 256, 512};
        int denom[] = {2, 0, 4, 4, 0, 8};
        try {// try 1
            for (int i = 0; i < numer.length; i++) {
                try { // try 2
                    System.out.println(numer[i] + " / " + denom[i] + " is " + numer[i] / denom[i]);
                } catch (ArithmeticException exc) { // catch 2
                    System.out.println("Can't divide by Zero!");
                }
            }
        } catch (ArrayIndexOutOfBoundsException exc) { // catch 1
            System.out.println("No matching element found.");
            System.out.println("Fatal error - program terminated.");
        }
    }
}
