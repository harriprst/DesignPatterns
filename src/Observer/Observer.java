package Observer;

import java.util.ArrayList;
import java.util.List;

public class Observer {
    List<Account> accountList = new ArrayList<>();

    public void add(Account account) {
        accountList.add(account);
    }

    public void notifyObservers() {
        accountList.forEach(account -> {account.mointorAccountNumberChange();});
    }


}
