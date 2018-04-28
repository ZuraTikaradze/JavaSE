package ge.cu.edu.Enumerations.RealExample;

public class Main {
    public static void main(String[] args) {
        showAccounts();
        makeTransaction();
    }

    public static void showAccounts() {
        for (Account account : getAccoutnList()) {
            if (account.getStatus() == AccountStatus.OPEN) {
                System.out.println(account.getAccountName());
            }
        }
    }

    public static void makeTransaction() {
        for (Account account : getAccoutnList()) {
            switch (account.getStatus()){
                case OPEN:
                    System.out.println(account.getAccountName() +" $$$$ ");
                    break;
                case CLOSED:
                    System.out.println(account.getAccountName() + " :(:(:(");
                    break;
                case FROZEN:
                    System.out.println(account.getAccountName() + " :( : ( !!! ");
                    break;
            }
        }
    }


    public static Account[] getAccoutnList() {

        Account account = new Account();
        account.setAccountName("სახელფასო");
        account.setAccountNumber("1234");
        account.setIBAN("GE60NB0000000123456789");
        account.setStatus(AccountStatus.OPEN);

        Account account1 = new Account();
        account1.setAccountName("ჩემი ანგარიში");
        account1.setAccountNumber("1234");
        account1.setIBAN("GE60NB0000000123456789");
        account1.setStatus(AccountStatus.OPEN);

        Account account2 = new Account();
        account2.setAccountName("ანგარიში 3");
        account2.setAccountNumber("1234");
        account2.setIBAN("GE60NB0000000123456789");
        account2.setStatus(AccountStatus.CLOSED);

        Account account3 = new Account();
        account3.setAccountName("ანგარიში 4");
        account3.setAccountNumber("1234");
        account3.setIBAN("GE60NB0000000123456789");
        account3.setStatus(AccountStatus.FROZEN);

        Account[] accounts = new Account[4];
        accounts[0] = account;
        accounts[1] = account1;
        accounts[2] = account2;
        accounts[3] = account3;

        return accounts;
    }
}
