package com.comrade.controller;

import com.comrade.model.LawRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/law")
public class WelcomeGkController {

    @PostMapping("/lawName")
    public String postRequest(@RequestBody LawRequest lawRequest){
        return lawRequest.getLawName().toUpperCase();
    }
}
