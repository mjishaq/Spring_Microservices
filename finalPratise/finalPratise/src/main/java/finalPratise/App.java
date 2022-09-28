package finalPratise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@SpringBootApplication (scanBasePackages = {"controller", "dto","service"})
@ComponentScan (basePackages =  {"service"})
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
