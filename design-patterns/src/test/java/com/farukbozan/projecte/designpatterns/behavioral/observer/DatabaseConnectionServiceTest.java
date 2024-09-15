package com.farukbozan.projecte.designpatterns.behavioral.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DatabaseConnectionServiceTest {

    @Test
    void should_observer() {
        //GIVEN
        SmsAccount smsAccount = new SmsAccount("99999999999");

        DatabaseListener databaseLogListener = new DatabaseListenerLogImpl();
        DatabaseListener databaseSMSListener = new DatabaseListenerSMSImpl(smsAccount);

        DatabaseConnectionService databaseConnectionService = new DatabaseConnectionService();

        databaseConnectionService.addDatabaseListener(databaseLogListener);
        databaseConnectionService.addDatabaseListener(databaseSMSListener);

        //WHEN
        databaseConnectionService.connectToDatabase();
        databaseConnectionService.disconnectFromDatabase();

        //THEN
        assertEquals(2, databaseConnectionService.getListenerSize());

        //GIVEN
        databaseConnectionService.removeDatabaseListener(databaseLogListener);

        //WHEN
        databaseConnectionService.connectToDatabase();
        databaseConnectionService.disconnectFromDatabase();

        //THEN
        assertEquals(1, databaseConnectionService.getListenerSize());
    }

}
