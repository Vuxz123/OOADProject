package com.ethnicthv.client.presentation;

import com.ethnicthv.server.application.ReviewControl;
import com.ethnicthv.server.business.util.ReviewInfo;

public class ReviewForm {
    private final ReviewControl reviewControl;

    public ReviewForm(ReviewControl reviewControl) {
        this.reviewControl = reviewControl;
    }

    public void run() {
        String input = "";
        boolean missingInfo = false;
        //TODO: get input

        if (missingInfo) {
            //TODO: request more
        }

        ReviewInfo info = new ReviewInfo(input);
        if (this.validate(info)) {
            reviewControl.saveReview(info);
        } else {
            //TODO: invalid input
        }
    }

    private boolean validate(ReviewInfo info) {
        return true;
    }
}
