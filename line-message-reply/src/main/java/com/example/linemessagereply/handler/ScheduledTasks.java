package com.example.linemessagereply.handler;


import com.example.linemessagereply.entity.Member;
import com.example.linemessagereply.service.AnnounceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class ScheduledTasks {

//    @Scheduled(initialDelay = 2000, fixedRate = 3000)
//    public void printUnixEpochTime() {
//        System.out.println(System.currentTimeMillis());
//    }
    @Autowired private AnnounceService announceService;

//    @Scheduled(cron = "0 0/1 * * * ?") // cron接受cron表示式，根據cron表示式確定定時規則
//    public void testCron() {
//
//        announceService.daily();
//    }

}
