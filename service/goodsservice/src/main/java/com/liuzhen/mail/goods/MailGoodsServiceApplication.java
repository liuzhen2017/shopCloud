package com.liuzhen.mail.goods;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan(basePackages = {"com.liuzhen.mail.*.mapper"})
@EnableCaching
public class MailGoodsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MailGoodsServiceApplication.class, args);
	}
}
