package com.comrade.controller;

import com.comrade.config.RecordNotFoundException;
import com.comrade.model.LawRequest;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/law")
public class WelcomeLawController {

    @PostMapping("/lawName")
    public String postRequest(@RequestBody LawRequest lawRequest, HttpServletRequest httpServletRequest){
        if (httpServletRequest != null) {
            if (httpServletRequest.getHeader("name") != null) {
                System.out.println("httpServletRequest.getHeader(\"name\") = " + httpServletRequest.getHeader("name"));
            }
        }
        if (lawRequest.getLawName() != null) {
            return lawRequest.getLawName().toUpperCase();
        }else {
            throw new RecordNotFoundException("INPUT IS NULL");
        }

    }
}
