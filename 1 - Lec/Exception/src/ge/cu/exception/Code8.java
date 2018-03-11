package ge.cu.exception;
/*
* Zura Tikaradze 2018
* A Closer Look at Throwable
* შეცდომს ხელოვნურად წარმოქმნა
*/
class ExcTest {
    static void genException() {
        int nums[] = new int[4];
        nums[7] = 10;
    }
}

class Code8 {
    public static void main(String args[]) {
        try {
            ExcTest.genException();
        } catch (ArrayIndexOutOfBoundsException exc) {

//            System.out.println(exc); //Standard message
//            exc.fillInStackTrace(); // Break Point
//            System.out.println(exc.getLocalizedMessage());
//            System.out.println(exc.getMessage());
//            exc.printStackTrace();
//            System.out.println(exc.toString());

        }

    }
}
