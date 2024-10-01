package io.codingogo.asyncontrollerdemo.controller;

import io.codingogo.asyncontrollerdemo.service.AsyncMailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class AsyncMailController {

    @Autowired
    private AsyncMailService asyncMailService;

    @GetMapping("/sendMails")
    public String sendMails() {
        String[] emails  =  new String[]{"a@gmail.com","b@gmail.com","c@gmail.com","d@gmail.com","e@gmail.com"};
        for (String email : emails) {
            asyncMailService.sendMail(email, "Testing", "This is a testing mail");
        }

        return "SUCCESS";
    }
}
