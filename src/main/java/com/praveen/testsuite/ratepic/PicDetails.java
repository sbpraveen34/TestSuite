package com.praveen.testsuite.ratepic;

import com.praveen.testsuite.base.AbstractComponent;
import com.praveen.testsuite.base.ComponentException;
import com.praveen.testsuite.base.StatusCode;
import com.praveen.testsuite.external.GetPicDetails;
import com.praveen.testsuite.external.requests.GetPicDetailsRequest;
import com.praveen.testsuite.external.response.GetPicDetailsResponse;
import com.praveen.testsuite.ratepic.request.RatePicRequest;
import com.praveen.testsuite.ratepic.request.RatePicResponse;

public class PicDetails extends AbstractComponent<RatePicRequest, RatePicResponse> {
    public static GetPicDetails getPicDetails = new GetPicDetails();
    public PicDetails(AbstractComponent<RatePicRequest, RatePicResponse> nextComponent) {
        super(nextComponent);
    }

    @Override
    public void apply(RatePicRequest request, RatePicResponse response) throws ComponentException {
        GetPicDetailsRequest picDetailsRequest = new GetPicDetailsRequest(request.nextPhotoId);
        try {
            GetPicDetailsResponse picDetailsResponse = getPicDetails.execute(picDetailsRequest);
        } catch (Exception e) {
            throw new ComponentException(e.getMessage(), StatusCode.API_FAILED);
        }
    }
}
