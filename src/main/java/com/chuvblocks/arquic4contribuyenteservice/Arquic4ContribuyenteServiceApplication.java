package com.chuvblocks.arquic4contribuyenteservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Arquic4ContribuyenteServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Arquic4ContribuyenteServiceApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
