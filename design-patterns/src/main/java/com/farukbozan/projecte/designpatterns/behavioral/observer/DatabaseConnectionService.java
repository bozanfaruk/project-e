package com.farukbozan.projecte.designpatterns.behavioral.observer;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DatabaseConnectionService {

    private final List<DatabaseListener> databaseListeners = new ArrayList<>();
    private final Random random = new Random();

    public void addDatabaseListener(DatabaseListener databaseListener) {
        databaseListeners.add(databaseListener);
    }

    public void removeDatabaseListener(DatabaseListener databaseListener) {
        databaseListeners.remove(databaseListener);
    }

    public int getListenerSize() {
        return databaseListeners.size();
    }

    public void connectToDatabase() {
        int connectionId = random.nextInt(100);
        databaseListeners.forEach(databaseListener -> databaseListener.onConnect(new ConnectEvent(LocalDateTime.now(), connectionId)));
    }

    public void disconnectFromDatabase() {
        databaseListeners.forEach(databaseListener -> databaseListener.onDisconnect(new DisconnectEvent(LocalDateTime.now(),
                                                                                                        "Connection is not available!!!")));
    }

}
