package it.com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("it.com.dao")        //扫描dao接口.
@SpringBootApplication
public class Application {
     
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}