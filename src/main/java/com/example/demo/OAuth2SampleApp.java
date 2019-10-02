package com.example.demo;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@EnableOAuth2Sso
public class OAuth2SampleApp extends SpringBootServletInitializer {

	
	/**
	 * when I am running as a jar this method will be used
	 * @param args
	 */
	public static void main(String[] args) {
		//starts here
		SpringApplication.run(OAuth2SampleApp.class, args);
	}
	
	
	/**
	 * when I am running as a war this method will be used
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
			
		return builder.sources(OAuth2SampleApp.class);
	}
	
	@PostConstruct
	public void init() {
		
		
	}
	
	
}
