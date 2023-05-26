package com.ff4j.languagefeature.configuration;

import org.ff4j.FF4j;
import org.ff4j.core.Feature;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.awt.*;

@Configuration
public class Ff4jConfig {

    public static final String FRENCH_LANG = "frenchLang";

    @Bean
    public FF4j FF4j(){
        FF4j ff4j = new FF4j();

        Feature frenchLang = new Feature(FRENCH_LANG);
        frenchLang.setEnable(true);

        ff4j.createFeature(frenchLang);
        return ff4j;
    }


}
