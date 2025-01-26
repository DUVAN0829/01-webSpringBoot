package co.duvan.springboot.webapp.springboot_webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
//@PropertySource("classpath:values.properties") // todo <- properties normal sin UTF-8 ->
@PropertySource(value = "classpath:values.properties", encoding = "UTF-8") // todo <- properties generada con UTF-8 para acentos->
public class SpringbootWebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWebappApplication.class, args);
	}

}
