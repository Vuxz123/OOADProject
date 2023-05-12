package com.ethnicthv.server.business.util;

public class AccountInfo {
    private final String accountName;
    private final String password;

    public AccountInfo(String accountName, String password) {
        this.accountName = accountName;
        this.password = password;
    }

    public AccountInfo normalize() {
        return this;
    }

}
