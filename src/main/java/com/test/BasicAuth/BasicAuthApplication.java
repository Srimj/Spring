package com.test.BasicAuth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication(exclude= {UserDetailsServiceAutoConfiguration.class})
public class BasicAuthApplication {

	private static final Logger logger = LoggerFactory.getLogger(BasicAuthApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BasicAuthApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder){
		return builder.build();
	}

	@Bean
	@Profile("!test")
	public CommandLineRunner showMessage(){
		return args -> {
			logger.info("Good morning");
		};
	}

}
