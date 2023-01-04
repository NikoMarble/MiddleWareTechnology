package dogshelter.demo.dogshelter.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

//makes class eligible for incoming REST calls
@RestController
public class ShelterApplication {
	
	@RequestMapping("/hello")
			public String sayHello() {
		return "Hello from the Shelter, Trafalgar Square 44, London";
	}
	
	@GetMapping("/helloagain") 
	public String sayHelloAgain() {
		return "hello from a second REST Endpoint";
		
	}
	
	@GetMapping("/helloTo/{name}") 
	public String sayHelloTo(@PathVariable String name) {
		return "hello to "+name;
		
	}

	public static void main(String[] args) {
		SpringApplication.run(ShelterApplication.class, args);
	}

}
