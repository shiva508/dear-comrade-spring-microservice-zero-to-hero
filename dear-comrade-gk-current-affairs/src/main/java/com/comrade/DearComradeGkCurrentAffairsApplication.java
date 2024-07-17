package com.comrade;

import com.comrade.model.LawRequest;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DearComradeGkCurrentAffairsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DearComradeGkCurrentAffairsApplication.class, args);
    }

    @Bean
    public ApplicationRunner applicationRunner(RestTemplate restTemplate){
        return args -> {
            String name = "http://localhost:8082/api/law/lawName";
            LawRequest lawRequest = new LawRequest("Women accusing man");
            HttpHeaders httpHeaders = new HttpHeaders();
            httpHeaders.set("name","Shiva");
            HttpEntity<LawRequest> httpEntity = new HttpEntity<>(lawRequest, httpHeaders);
            System.out.println("restTemplate.postForEntity(name, httpEntity, String.class) = " + restTemplate.postForEntity(name, httpEntity, String.class).getBody());
        };
    }
}