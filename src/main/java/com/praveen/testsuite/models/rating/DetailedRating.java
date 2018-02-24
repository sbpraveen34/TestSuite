package com.praveen.testsuite.models.rating;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;

public class DetailedRating {
    private class DtdRating {
        @JsonProperty
        int maleRating;
        @JsonProperty
        int femaleRating;

        public int getMaleRating() {
            return maleRating;
        }

        public void setMaleRating(int maleRating) {
            this.maleRating = maleRating;
        }

        public int getFemaleRating() {
            return femaleRating;
        }

        public void setFemaleRating(int femaleRating) {
            this.femaleRating = femaleRating;
        }
    }

    @JsonProperty
    HashMap<String, DtdRating> detailedRateOnIndex;
}
