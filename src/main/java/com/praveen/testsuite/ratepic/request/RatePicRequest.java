package com.praveen.testsuite.ratepic.request;

import com.praveen.testsuite.base.ComponentRequest;

import java.util.ArrayList;
import java.util.List;

public class RatePicRequest extends ComponentRequest {
    public final String nextPhotoId;
    public final String userId;
    public List<String> ratedPhotosList = new ArrayList<>();
    public RatePicRequest(String currentPhotoId, String userId) {
        this.nextPhotoId = currentPhotoId;
        this.userId = userId;
    }

    public void addRatedPhotoId(String photoId) {
        this.ratedPhotosList.add(photoId);
    }
}
