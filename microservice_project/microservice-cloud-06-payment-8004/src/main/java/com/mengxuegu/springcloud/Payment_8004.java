package com.mengxuegu.springcloud;

import com.mengxuegu.springcloud.entities.Payment;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@MapperScan("com.mengxuegu.springcloud.mapper.PaymentMapper")
@SpringBootApplication
public class Payment_8004 {
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(Payment_8004.class, args);
    }
}
