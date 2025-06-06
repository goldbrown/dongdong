package com.chris.dongdong;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.chris")
public class DongdongApplication {

	public static void main(String[] args) {
		SpringApplication.run(DongdongApplication.class, args);
	}

}
