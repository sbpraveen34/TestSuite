package com.praveen.testsuite.ratepic;

import com.praveen.testsuite.base.AbstractComponent;
import com.praveen.testsuite.base.ComponentException;
import com.praveen.testsuite.external.AllMyPhotos;
import com.praveen.testsuite.ratepic.request.RatePicRequest;
import com.praveen.testsuite.ratepic.request.RatePicResponse;

public class UserAllPhoto extends AbstractComponent<RatePicRequest, RatePicResponse> {

    public static final AllMyPhotos allMyPhotos = new AllMyPhotos();

    public UserAllPhoto(AbstractComponent<RatePicRequest, RatePicResponse> nextComponent) {
        super(nextComponent);
    }

    @Override
    public void apply(RatePicRequest request, RatePicResponse response) throws ComponentException {
        try {

        } catch (Exception e) {

        }
    }
}
