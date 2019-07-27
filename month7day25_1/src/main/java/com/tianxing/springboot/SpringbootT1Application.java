package com.tianxing.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;

@ImportResource(value= {"classpath:spring-web.xml"})
@SpringBootApplication
public class SpringbootT1Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootT1Application.class, args);
	}

	@Override
	public SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SpringbootT1Application.class);
	}

}
