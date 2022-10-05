package com.example.linemessagereply.service;

import com.example.linemessagereply.ideachain.GetApi;
import com.example.linemessagereply.entity.Member;
import com.example.linemessagereply.entity.Sensor;
import com.linecorp.bot.client.LineMessagingClient;
import com.linecorp.bot.model.PushMessage;
import com.linecorp.bot.model.message.TextMessage;
import com.linecorp.bot.model.response.BotApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

@Service
public class AnnounceService {
    @Autowired
    private MemberService memberService;

    public void daily(){ //announce uv, temp, hum
        for(Member i :memberService.getAll()){

            GetApi test = new GetApi(i.getdeviceId());
            Sensor sensor = test.getSensor();

            final LineMessagingClient client = LineMessagingClient
                    .builder("aGLSAm6glSjuEZejBncJkwh1C2YAQCivBnHkwtq+JDh1pgEeYP/fnuk/L44zWMZAs7XpceyBlpzopMEIywUJA3Q1tEnkXOOzk4gr/Ncxffs4NP/K91qvi1vSEHga+Lt2L4P9kmx3ICRE0FNt6Tm94gdB04t89/1O/w1cDnyilFU=")
                    .build();
            final TextMessage textMessage = new TextMessage(sensor.toString());
            final PushMessage pushMessage = new PushMessage(
                    i.getuserId(),
                    textMessage);

            final BotApiResponse botApiResponse;
            try {
                botApiResponse = client.pushMessage(pushMessage).get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
                return;
            }

            System.out.println(botApiResponse);
        }
    }

    /*1662955200000*//*1663686000000*/
    public void period(String startTime , String  endTime){
        List<Sensor> list = new ArrayList();
        GetApi test2 = new GetApi("e762d3d0-328b-11ed-92f4-e76ba21be8a9", startTime,endTime);
        list = test2.getSensors();
        System.out.println(list);
    }
}
