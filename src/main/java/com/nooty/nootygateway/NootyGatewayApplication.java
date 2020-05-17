package com.nooty.nootygateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class NootyGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(NootyGatewayApplication.class, args);
	}

}
