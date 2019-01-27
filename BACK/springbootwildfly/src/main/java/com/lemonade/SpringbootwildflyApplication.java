package com.lemonade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
// Spring Boot 2.x
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

// Spring Boot 1.x
//import org.springframework.boot.web.support.SpringBootServletInitializer;
 
@SpringBootApplication
@EnableJpaAuditing
public class SpringbootwildflyApplication extends SpringBootServletInitializer {
 
    public static void main(String[] args) {
        SpringApplication.run(applicationClass, args);
    }
 
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(applicationClass);
    }
 
    private static Class<SpringbootwildflyApplication> applicationClass = SpringbootwildflyApplication.class;
}
 
//@RestController
//class HelloController {
// 
//    @RequestMapping("/hello/{name}")
//    String hello(@PathVariable String name) {
// 
//        return "Hi " + name + " !";
// 
//    }
//}
