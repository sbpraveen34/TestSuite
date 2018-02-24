package com.praveen.testsuite.ratepic;

import com.praveen.testsuite.base.AbstractComponent;
import com.praveen.testsuite.base.ComponentException;
import com.praveen.testsuite.external.GetNextPhoto;
import com.praveen.testsuite.ratepic.request.RatePicRequest;
import com.praveen.testsuite.ratepic.request.RatePicResponse;

public class CheckNextPhoto extends AbstractComponent<RatePicRequest, RatePicResponse> {

    public static final GetNextPhoto getNextPhoto = new GetNextPhoto();

    public CheckNextPhoto(AbstractComponent<RatePicRequest, RatePicResponse> nextComponent) {
        super(nextComponent);
    }

    @Override
    public void apply(RatePicRequest request, RatePicResponse response) throws ComponentException {

    }
}
