package ge.cu.exception;
/*
* Zura Tikaradze 2018
* The Consequences of an Uncaught Exception
* კოდის ამ ნაწილში არ ხდება შეცდომების დამუშავება
*/
class Code2 {
    public static void main(String args[]) {

        int nums[] = new int[4];
        System.out.println("Before exception is generated.");
        nums[7] = 10; // კოდის ეს ფრაგმენტი გამოიწვევს შეცდომას რადგან არარსებულ ინდექსს მივმართავთ

    }
}
