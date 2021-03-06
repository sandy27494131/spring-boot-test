package org.windwant.spring.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * BootJob
 */
@Component
public class BootJob {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 1000)
    public void reportTime(){
        System.out.println("current time is: " +  dateFormat.format(new Date()));
    }
}
