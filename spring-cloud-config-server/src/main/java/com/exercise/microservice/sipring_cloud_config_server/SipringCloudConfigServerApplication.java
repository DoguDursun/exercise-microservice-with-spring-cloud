package com.exercise.microservice.sipring_cloud_config_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SipringCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SipringCloudConfigServerApplication.class, args);
	}

}
