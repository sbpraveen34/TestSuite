package com.praveen.testsuite.models.rating;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;

public class AverageRating {
    private class AvgRating {
        @JsonProperty
        private int maleAvg;

        @JsonProperty
        private int numMales;

        @JsonProperty
        private int femaleAvg;

        @JsonProperty
        private int numFemales;

        public int getMaleAvg() {
            return maleAvg;
        }

        public void setMaleAvg(int maleAvg) {
            this.maleAvg = maleAvg;
        }

        public int getNumMales() {
            return numMales;
        }

        public void setNumMales(int numMales) {
            this.numMales = numMales;
        }

        public int getFemaleAvg() {
            return femaleAvg;
        }

        public void setFemaleAvg(int femaleAvg) {
            this.femaleAvg = femaleAvg;
        }

        public int getNumFemales() {
            return numFemales;
        }

        public void setNumFemales(int numFemales) {
            this.numFemales = numFemales;
        }
    }

    @JsonProperty
    private HashMap<String, AvgRating> ratings;

    public HashMap<String, AvgRating> getRatings() {
        return ratings;
    }

    public void setRatings(HashMap<String, AvgRating> ratings) {
        this.ratings = ratings;
    }
}
