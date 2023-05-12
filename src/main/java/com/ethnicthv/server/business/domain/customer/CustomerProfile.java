package com.ethnicthv.server.business.domain.customer;

import com.ethnicthv.server.business.util.AccountInfo;

public class CustomerProfile {

    private Account account;

    public CustomerProfile(AccountInfo info) {
        this.account = new Account(info);
    }

}
