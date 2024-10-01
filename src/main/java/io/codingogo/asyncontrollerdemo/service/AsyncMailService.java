package io.codingogo.asyncontrollerdemo.service;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@Slf4j
public class AsyncMailService {
    @Async("asyncMailThreadPool")
    @SneakyThrows
    public void sendMail(String to, String subject, String body) {
        Thread.sleep(new Random().nextInt(3000));
        log.info("Sending mail to {}", to);
    }
}
