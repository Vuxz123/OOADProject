package com.ethnicthv.client.presentation;

import com.ethnicthv.server.application.RegisterControl;
import com.ethnicthv.server.business.util.AccountInfo;
import com.ethnicthv.server.business.util.ValidateUtil;

public class RegisterForm {
    private RegisterControl registerControl;

    public RegisterForm(RegisterControl registerControl) {
        this.registerControl = registerControl;
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
            if(registerControl.registerAccount(new AccountInfo(accountName, password))) {
                //TODO: success
                loginResponse();
            } else {
                //TODO: account existed
                this.accountExistedResponse();
            }
        } else {
            //TODO: invalid information
            this.invalidInfoResponse();
        }
    }

    public void invalidInfoResponse() {
    }

    public void accountExistedResponse() {

    }

    public void loginResponse() {

    }
}
