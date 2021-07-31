package com.que.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.*;
import java.net.URI;

/**
 * @author guozhengMu
 * @version 1.0
 * @date 2020/10/16 11:49
 */
@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(DemoApplication.class, args);

        // Desktop.getDesktop().browse(new URI("http://localhost:8085/data/user"));
    }
}
