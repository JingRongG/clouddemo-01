package com.guojr.clouddemo.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class RocketMQHealthIndicator implements HealthIndicator {
    @Override
    public Health health() {
        int errorcode = check();
        if(errorcode != 0 ){
            return Health.down().withDetail("Error Code", errorcode).build();
        }
        return Health.up().build();
    }

    private int check(){
        return 0;
    }
}
