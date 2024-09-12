package com.farukbozan.projecte.designpatterns.structural.proxy.protection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GatewayProxyTest {

    @Test
    void should_get_proxy_result() {
        //GIVEN
        Request request = new Request("127.0.0.1", "Valid request");
        Request invalidRequest = new Request("127.0.0.4", "Invalid request");
        Gateway gateway = new GatewayProxy();

        //WHEN
        boolean validRequestResult = gateway.executeRequest(request);
        boolean invalidRequestResult = gateway.executeRequest(invalidRequest);

        //THEN
        assertTrue(validRequestResult);
        assertFalse(invalidRequestResult);
    }

}
