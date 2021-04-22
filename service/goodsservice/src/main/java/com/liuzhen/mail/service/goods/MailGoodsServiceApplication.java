package com.liuzhen.mail.service.goods;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.liuzhen.mail.service.goods.mapper"})
public class MailGoodsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MailGoodsServiceApplication.class, args);
	}

}
