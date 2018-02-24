package com.praveen.testsuite.models.pic;

public enum PicStatus {
    active(1),
    inactive(0);

    private int code;

    PicStatus(int code) {
        this.code = code;
    }
}
