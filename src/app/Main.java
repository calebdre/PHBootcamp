package app;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class Main {

    public static void main(String[] args) {
        String ACCOUNT_SID = "ACef4516da75e401c1417f2d0836738524";
        String AUTH_TOKEN = "8a9ad7fa67f7d9b0bbcf144377b2fed4";

        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message
                .creator(new PhoneNumber("+17708810074"),  // to
                        new PhoneNumber("+14703090394"),  // from
                        "Hello world!")
                .create();
        /*
            log in with cardnumber & pin
            choose account to make transactions with
            withdraw money from selected account
            deposit money from select account
            receive text alerts when withdraw or deposit money
            be able to save information when exited
         */
//        new LoginView().render();
    }
}
