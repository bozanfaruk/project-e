package com.farukbozan.projecte.designpatterns.behavioral.observer;

public interface DatabaseListener {

    void onConnect(ConnectEvent connectEvent);

    void onDisconnect(DisconnectEvent disconnectEvent);

}
