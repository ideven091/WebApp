package com.cleo.webapp;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class WebAppApplication {

    public static void main(String[] args) {
        log.info("Started at server At:" + System.currentTimeMillis());
        SpringApplication.run(WebAppApplication.class, args);
    }

}
