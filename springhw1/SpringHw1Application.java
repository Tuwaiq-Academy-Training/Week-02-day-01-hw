package camp.example.springhw1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringHw1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringHw1Application.class, args);
	}

	@Bean
	public  String hey2(){
		return "Reem";
	}
}
