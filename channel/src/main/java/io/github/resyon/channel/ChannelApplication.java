package io.github.resyon.channel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ChannelApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChannelApplication.class, args);
	}

}
