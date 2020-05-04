package com.oreilly.restclient.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class JokeService {
    private RestTemplate restTemplate;

    @Autowired // not actually needed here since there's only one constructor
    public JokeService(RestTemplateBuilder builder) {
        restTemplate = builder.build();
    }
}
