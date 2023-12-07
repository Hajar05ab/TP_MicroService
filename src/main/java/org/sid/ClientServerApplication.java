package org.sid;

import java.util.stream.Stream;

import org.sid.ClientService.Model.Client;
import org.sid.ClientService.Repository.ClientRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@SpringBootApplication
public class ClientServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientServerApplication.class, args);
	}
	
	@Bean
	CommandLineRunner start(ClientRepository clientRepository) {
		return args->{
			
			
				clientRepository.save(new Client(Long.parseLong("1"), "HAJAR", " ab", Float.parseFloat("22")));
				clientRepository.save(new Client(Long.parseLong("2"), "SOUKA" , " an", Float.parseFloat("26")));
			
			
		};
	}

}
