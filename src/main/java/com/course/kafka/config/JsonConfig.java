package com.course.kafka.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JsonConfig {

    @Bean
    public ObjectMapper objectMapper(){
        var o = new ObjectMapper();
        o.findAndRegisterModules();
        o.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        return o;
    }
}
