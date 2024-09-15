package com.farukbozan.projecte.designpatterns.behavioral.observer;

import java.time.LocalDateTime;

public record ConnectEvent(LocalDateTime connectTime, int connectionId) {

}
