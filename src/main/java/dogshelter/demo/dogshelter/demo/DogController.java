package dogshelter.demo.dogshelter.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dog")
public class DogController {
	
	private DogService dogservice;

	public DogController(DogService dogservice) {
		super();
		this.dogservice = dogservice;
	}
	
	@GetMapping
	public List<Dog> getAllDogs() {
		return dogservice.getAllDogs();
	}
	
	@PostMapping
	public void addDog(@RequestBody Dog dog) {
		dogservice.addDog(dog);
		
	}
	

}
