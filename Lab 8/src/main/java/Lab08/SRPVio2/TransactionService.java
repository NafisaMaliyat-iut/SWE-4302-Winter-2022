package Lab08.SRPVio2;

import java.util.Map;

public class TransactionService {
    public Map<String, Account> accounts;

    public void transfer(String senderAccountID, String receieverAccountID, long balance){
        //searches for the sender account
        //calls it credit method
        //searches for the receiver account
        //calls it debit method
        for(Map.Entry<String, Account> me : accounts.entrySet()) {
            if(me.getKey() == senderAccountID){
                me.getValue().credit(balance);
            }
            if(me.getKey() == receieverAccountID)
                me.getValue().debit(balance);
        }
    }

}
