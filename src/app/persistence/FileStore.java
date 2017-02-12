package app.persistence;

import app.persistence.value.Account;
import app.persistence.value.User;

import java.io.File;

public class FileStore implements DataStore {

    File file;

    public FileStore() {
        this.file = file;
    }

    @Override
    public User getUser() {
        return null;
    }

    @Override
    public void addUser(User user) {

    }

    @Override
    public void updateAccount(Account account) {

    }

    @Override
    public void addAccount(Account account) {

    }


}
