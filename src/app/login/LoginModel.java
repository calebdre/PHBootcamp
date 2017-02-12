package app.login;

import app.persistence.DataStore;
import app.persistence.DataStoreInstance;
import app.persistence.value.User;

public class LoginModel {

    private DataStore dataStore = DataStoreInstance.getInstance();

    public User getUser(){
        return dataStore.getUser();
    }
}
