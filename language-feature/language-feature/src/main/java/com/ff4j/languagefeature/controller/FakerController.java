package com.ff4j.languagefeature.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.ff4j.languagefeature.FeignInterface.FakerApiClient;
import com.ff4j.languagefeature.configuration.Ff4jConfig;
import com.ff4j.languagefeature.model.User;
import lombok.extern.slf4j.Slf4j;
import org.ff4j.FF4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.util.Collection;
import java.util.List;
import java.util.Properties;

@RestController
@RequestMapping("/api")
@Slf4j
public class FakerController {

    @Autowired
    private FakerApiClient fakerApiClient;

    @Autowired
    ObjectMapper mapper;

    @Autowired
    private FF4j ff4j;


    Properties properties=new Properties();

    String lang;



    @GetMapping("/allUsers")
    public List<User> getUsers()
    {
        FileOutputStream stream;
        String path= "C:\\Users\\USER\\Downloads\\language-feature\\language-feature\\src\\main\\resources\\application.properties";
        try {
           stream = new FileOutputStream(path);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        if(ff4j.check(Ff4jConfig.FRENCH_LANG)){
            lang = "fr_FR";
            properties.put("locale.language",lang);
            try {
                properties.store(stream,null);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            log.info("French******");
        }else {
            lang =  "en_US";
            properties.put("locale.language",lang);
            try {
                properties.store(stream,null);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            log.info("ENGLISH******");
        }
        List<User> readValues = null;
        JsonNode result = fakerApiClient.getUsers().get("data");
        ObjectReader reader = mapper.readerFor(new TypeReference<List<User>>() {
        });
        try {
            readValues = reader.readValue(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return readValues;
    }



//    @GetMapping("/fakerCall")
//    public Mono<User> someRestCall() {
//
//        if(ff4j.check(Ff4jConfig.FRENCH_LANG)){
//            lang ="fr_FR";
//
//            log.info("French******");
//        }else {
//            lang =  "en_US";
//            log.info("ENGLISH******");
//        }
//        return this.webClient.get().uri(url)
//                .retrieve().bodyToMono(User.class);
//    }

}
