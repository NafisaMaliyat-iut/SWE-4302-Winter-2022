package Lab08.SRPVio2;

public class Account {
    String AccountId;
    long balance;

    public Account(String id, long balance){
        this.AccountId = id;
        this.balance = balance;
    }

    public long getBalance() {
        return this.balance;
    }

    public void credit(long deductBalance){
        this.balance -= balance;
    }

    public void debit(long addBalance){
        this.balance+=balance;
    }


}
