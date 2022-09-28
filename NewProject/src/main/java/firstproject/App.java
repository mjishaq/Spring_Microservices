package firstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication (scanBasePackages = { 
		  "/firstproject",
		  "/controller", "/Interface","/service"})
public class App {

	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
