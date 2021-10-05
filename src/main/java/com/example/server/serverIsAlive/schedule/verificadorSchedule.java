package com.example.server.serverIsAlive.schedule;

import com.example.server.serverIsAlive.service.VerificadorService;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@EnableScheduling
public class verificadorSchedule {

    @Scheduled(fixedDelay = 60000)
    public void verificarServidor() throws IOException {

        if(VerificadorService.isServerAlive("192.168.11.101",8093,2000)){
            System.out.println("server is alive");
        }else{
            System.out.println("server is down");
        }
    }
}
