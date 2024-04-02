package br.com.apicep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ApicepApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApicepApplication.class, args);
	}

}
