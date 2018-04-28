package ge.cu.edu.Enumerations;

public class Code1 {
    public static void main(String[] args) {

        // values() - მეთოდის გამოყენება
        for (Transport t : Transport.values()) {
            System.out.println(t.name());
        }

        // valueOf -მეთოდი
        Transport t = Transport.valueOf("TRAIN");
        System.out.println(t.name());

        // Ordinal()
        System.out.println(t.ordinal());

        //compareTo
        System.out.println(t.compareTo(Transport.TRAIN));
    }
}
