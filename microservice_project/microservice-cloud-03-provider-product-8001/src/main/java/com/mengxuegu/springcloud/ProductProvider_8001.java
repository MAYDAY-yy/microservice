package com.mengxuegu.springcloud;

import com.mengxuegu.springcloud.service.TicketService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@MapperScan("com.mengxuegu.springcloud.mapper")
@SpringBootApplication
public class ProductProvider_8001 {

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(ProductProvider_8001.class, args);
    }

}
