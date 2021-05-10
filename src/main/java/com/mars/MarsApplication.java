package com.mars;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MarsApplication {
    private static final Logger logger = LoggerFactory.getLogger(MarsApplication.class.getName());

    public static void main(String[] args) {

        SpringApplication.run(MarsApplication.class, args);
        logger.info(">>>>>>>start success<<<<<<<");
    }

}
