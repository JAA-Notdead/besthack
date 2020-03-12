package com.boots;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

//@ServletComponentScan
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        SecurityManager securityManager = System.getSecurityManager();
       // myfilter.doFilter("Strict-Transport-Security: max-age=31536000", "preload");
    }
}
