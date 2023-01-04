package dogshelter.demo.dogshelter.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DogService {
	
	@Autowired
	private DogRepo dogrepo;

	public DogService(DogRepo dogrepo) {
		super();
		this.dogrepo = dogrepo;
	}
	
	public void addDog(Dog dog) {
		
		if(dog.getName().matches("empty")) {
			throw new DogNotFoundException("");
		}
		else {
			dogrepo.save(dog);
		}
	}
	
	public List<Dog> getAllDogs() {
		return dogrepo.findAll();
	}

}
