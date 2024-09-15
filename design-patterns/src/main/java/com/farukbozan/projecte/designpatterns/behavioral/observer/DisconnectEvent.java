package com.farukbozan.projecte.designpatterns.behavioral.observer;

import java.time.LocalDateTime;

public record DisconnectEvent(LocalDateTime disconnectTime, String reason) {

}
