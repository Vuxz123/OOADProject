package com.ethnicthv.server.application;

import com.ethnicthv.server.business.domain.customer.Account;
import com.ethnicthv.server.business.domain.customer.CustomerProfile;
import com.ethnicthv.server.business.domain.customer.CustomerProfiles;
import com.ethnicthv.server.business.util.AccountInfo;

public class RegisterControl {
    public boolean registerAccount (AccountInfo info) {
        if(!CustomerProfiles.hasAccount(info)) return false;
        var normalized = this.normalizeInfo(info);
        CustomerProfile newAccount = new CustomerProfile(info);
        return true;
    }

    public AccountInfo normalizeInfo(AccountInfo info) {
        var normalized = info.normalize();
        return normalized;
    }

}
