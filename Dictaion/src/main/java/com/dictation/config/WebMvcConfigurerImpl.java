package com.dictation.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfigurerImpl implements WebMvcConfigurer {
	
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**") //��� ��û�� ���ؼ�
				.allowedOrigins("http://localhost:8080/"); // �� ���÷ν�Ʈ�� ����Ѵ�.
	}
}
