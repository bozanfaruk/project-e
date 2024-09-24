package com.farukbozan.projecte.memorymanagement;

public class CallByValue {

    private int callCount;

    private String callName;

    public CallByValue(int callCount, String callName) {
        this.callCount = callCount;
        this.callName = callName;
    }

    public int getCallCount() {
        return callCount;
    }

    public void setCallCount(int callCount) {
        this.callCount = callCount;
    }

    public String getCallName() {
        return callName;
    }

    public void setCallName(String callName) {
        this.callName = callName;
    }
}
