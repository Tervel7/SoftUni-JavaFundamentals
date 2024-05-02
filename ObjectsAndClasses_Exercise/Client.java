package OOP;

import java.util.ArrayList;

public class Client {

    private int id;
    private String name;
    private String phone;

    private ArrayList<Account> accounts;

    Client(int id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;

        accounts =  new ArrayList<>();
    }

    public boolean addAccount(Account account) {
        accounts.add(account);
        return  true;
    }

    public boolean removeAccount(int accountId) {
        for (Account account : accounts)
            if (account.getId() == accountId){
                accounts.remove(account);
                return true;
            }
        return false;
    }
}
