package ge.cu.edu.Enumerations.RealExample;

// Java Bean
public class Account {
    int id;
    String accountNumber;
    String IBAN;
    AccountStatus Status;
    String accountName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public AccountStatus getStatus() {
        return Status;
    }

    public void setStatus(AccountStatus status) {
        Status = status;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
}
