package com.zlw.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.AbstractJackson2HttpMessageConverter;

import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.smile.SmileFactory;
import com.fasterxml.jackson.module.afterburner.AfterburnerModule;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Project:   spring-swagger2markup-demo
 * @author Robert Winkler
 */
@SpringBootApplication
@EnableSwagger2
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    @Bean
    public Module jacksonAfterBurnerModule() {
        return new AfterburnerModule();
    }

    @Bean
    public HttpMessageConverter httpSmileJackson2MessageConverter() {
        return new AbstractJackson2HttpMessageConverter(
                new ObjectMapper(new SmileFactory()).registerModule(new AfterburnerModule()),
                new MediaType("application", "x-jackson-smile")) {
        };
    }
}
