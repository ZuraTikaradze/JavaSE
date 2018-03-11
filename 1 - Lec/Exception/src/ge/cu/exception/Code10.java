package ge.cu.exception;

/*
* Zura Tikaradze 2018
* Using throws
* შეცდომის სხვა მეთოდისთვის გადაცემა დასამუშავებლად
*/
class Code10 {
    static void throwOne() throws  IllegalAccessException {
        System.out.println("throwOne-ის შიგნით");
        throw new IllegalAccessException("Demo");
    }
    public static void main(String args[]) {
        try {
            throwOne();
        } catch (IllegalAccessException е) {
            System.out.println("გამოიჭირება" + е);
        }
    }
}
