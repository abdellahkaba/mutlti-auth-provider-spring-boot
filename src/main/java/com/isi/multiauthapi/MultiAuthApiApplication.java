package com.isi.multiauthapi;

import com.isi.multiauthapi.configs.AppProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class MultiAuthApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MultiAuthApiApplication.class, args);
    }

}
