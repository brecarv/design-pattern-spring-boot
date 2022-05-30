package dio.designpatternspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DesignPatternSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternSpringBootApplication.class, args);
	}

}
