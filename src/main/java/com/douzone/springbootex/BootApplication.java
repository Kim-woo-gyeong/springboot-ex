package com.douzone.springbootex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootConfiguration
//java config로 해놨던 설정들을 자동으로 설정해줌..?
@EnableAutoConfiguration
@ComponentScan("com.douzone.springbootex.controller")
public class BootApplication {
	public static void main(String[] args) {
		SpringApplication.run(BootApplication.class, args);
	}
}
