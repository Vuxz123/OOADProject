package com.ethnicthv.client.presentation;

import com.ethnicthv.server.application.ProfileControl;
import com.ethnicthv.server.business.util.AccountInfo;
import com.ethnicthv.server.business.util.ValidateUtil;

public class LoginForm {
    private final ProfileControl profileControl;

    public LoginForm(ProfileControl profileControl) {
        this.profileControl = profileControl;
    }

    public boolean validateInfo(AccountInfo info) {
        return ValidateUtil.validateAccountInfor(info);
    }

    public void run() {
        String accountName = "";
        String password = "";
        //TODO: get user input
        AccountInfo info = new AccountInfo(accountName, password);
        if(this.validateInfo(info)) {
            if(profileControl.login(info)) {
                //TODO: success
            }else {
                //TODO: login fail
                this.resetForm();
            }
        }else {
            //TODO: invalid information
            this.invalidInfoResponse();
        }
    }

    private void resetForm() {

    }

    private void invalidInfoResponse() {
    }
}
