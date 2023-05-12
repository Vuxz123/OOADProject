package com.ethnicthv.client.presentation;

import com.ethnicthv.server.application.ProfileControl;
import com.ethnicthv.server.business.util.AccountInfo;

public class LogoutForm {
    private final ProfileControl profileControl;

    public LogoutForm(ProfileControl profileControl) {
        this.profileControl = profileControl;
    }

    public void run() {
        String accountName = "";
        String password = "";
        //TODO: get user input
        AccountInfo info = new AccountInfo(accountName, password);
        if (this.confirm()) {
            profileControl.logout(info);
            //TODO: return to login screen
        }
        //TODO: response
    }

    private boolean confirm() {
        return true;
    }
}
