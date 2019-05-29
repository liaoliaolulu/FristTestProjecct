package com.lx.test.javademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@RequestMapping("/test")
@RestController
public class JavademoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavademoApplication.class, args);
    }

    @GetMapping(value = "/test")
    public String test(String str) {
        System.out.println(str);
        return str + "QWE";
    }

}
