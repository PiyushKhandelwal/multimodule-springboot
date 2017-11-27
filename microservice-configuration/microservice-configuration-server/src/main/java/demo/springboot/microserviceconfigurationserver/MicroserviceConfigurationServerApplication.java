package demo.springboot.microserviceconfigurationserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MicroserviceConfigurationServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceConfigurationServerApplication.class, args);
	}
}
