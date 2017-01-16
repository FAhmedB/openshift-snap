package com.directions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class OpenshiftSnapApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(OpenshiftSnapApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(OpenshiftSnapApplication.class);
    }
}
