package com.farukbozan.projecte.designpatterns.structural.proxy.protection;

public class Request {

    private final String ip;

    private final String body;

    public Request(String ip, String body) {
        this.ip = ip;
        this.body = body;
    }

    public String getIp() {
        return ip;
    }

    @Override
    public String toString() {
        return "Request{" + "ip='" + ip + '\'' + ", request='" + body + '\'' + '}';
    }
}
