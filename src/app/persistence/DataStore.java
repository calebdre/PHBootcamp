package app.persistence;

import app.persistence.value.Account;
import app.persistence.value.User;

public interface DataStore {
    User getUser();
    void addUser(User user);
    void updateAccount(Account account);
    void addAccount(Account account);
}
