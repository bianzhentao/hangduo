package com.kgc.springboot2018.hangduo;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(basePackages = "com.kgc.springboot2018.hangduo.mapper")
@SpringBootApplication
public class HangduoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HangduoApplication.class, args);
	}

}
