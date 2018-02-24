package com.praveen.testsuite.base;

public class ComponentException extends Exception {

    private StatusCode statusCode;
    private boolean terminateRequest = false;

    public ComponentException(String message, StatusCode statusCode) {
        super(message);
        this.statusCode = statusCode;
    }

    public ComponentException(String message, Throwable cause, StatusCode statusCode) {
        super(message, cause);
        this.statusCode = statusCode;
    }

    public StatusCode getStatusCode() {
        return statusCode;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + ". ## " + statusCode;
    }

    public String getFailureReason() {
        return super.getMessage();
    }

    public boolean isTerminateRequest() {
        return terminateRequest;
    }

    public void setTerminateRequest(boolean terminateRequest) {
        this.terminateRequest = terminateRequest;
    }
}
