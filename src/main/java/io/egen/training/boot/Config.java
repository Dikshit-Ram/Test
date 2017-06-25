package io.egen.training.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class Config {
	   public static void main(String[] args) {
	        ApplicationContext ctx = SpringApplication.run(Config.class, args);
	        	
	    }
}
