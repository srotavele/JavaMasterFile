package srotavele.strings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Strings {
	public static void main(String[] args) {
		SpringApplication.run(StringsApplication.class, args);
		
	}
	@RequestMapping("/")
	public String helloClient() {
			return "Hello, Client. How are you doing?";
					
	}
	@RequestMapping("/random")
	public String rand() {
		return "Spring Boot is great! So easy to just respond with strings!";
		
	}

}
