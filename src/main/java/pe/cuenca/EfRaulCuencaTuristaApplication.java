package pe.cuenca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EfRaulCuencaTuristaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfRaulCuencaTuristaApplication.class, args);
	}

}
