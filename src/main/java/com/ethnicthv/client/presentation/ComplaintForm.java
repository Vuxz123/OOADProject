package com.ethnicthv.client.presentation;

import com.ethnicthv.server.application.ModeratorResolveControl;
import com.ethnicthv.server.business.util.ComplaintInfo;

public class ComplaintForm {
    private final ModeratorResolveControl control;

    public ComplaintForm(ModeratorResolveControl control) {
        this.control = control;
    }

    public void run() {
        String input = "";
        //TODO: get input
        ComplaintInfo info = new ComplaintInfo(input);

        if(this.confirm()) {
            if(!control.sendComplaint(info)) {
                //TODO: submission fail
            }
        }
    }

    private boolean confirm() {
        return true;
    }
}
