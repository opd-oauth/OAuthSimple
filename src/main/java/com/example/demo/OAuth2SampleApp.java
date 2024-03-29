package com.example.demo;

import java.security.Principal;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableOAuth2Sso
@RestController
public class OAuth2SampleApp {

	@RequestMapping("/user")
	public Principal user(Principal principal) {
		return principal;
	}

	/**
	 * when running as a jar this method will be used
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// starts here
		SpringApplication.run(OAuth2SampleApp.class, args);
	}

	@PostConstruct
	public void init() {

	}

}
