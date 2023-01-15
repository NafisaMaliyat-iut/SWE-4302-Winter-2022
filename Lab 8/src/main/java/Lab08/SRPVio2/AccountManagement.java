package Lab08.SRPVio2;

import java.util.List;
import java.util.Map;

public class AccountManagement {
    public Map<String, Account> accounts;



    public Account findAccountForUser(String accountId){
        //searches in the map for the accountId string and returns the account obj when matched
        for(Map.Entry<String, Account> me : accounts.entrySet()) {
            if(me.getKey() == accountId){
                return me.getValue();
            }
        }
        return null; //not found
    }

    public void addAccount(String accountId, Account account){
        //adds to the map
        accounts.put(accountId, account);
    }

    //service
    //se

    public void UpdateAccount(Account account){
        for(Map.Entry<String, Account> me : accounts.entrySet()) {
            if(me.getKey() == account.AccountId){
                me.getValue().balance = account.balance;
            }
        }
    }

}
