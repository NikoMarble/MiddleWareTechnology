package dogshelter.demo.dogshelter.demo;

public class DogNotFoundException extends RuntimeException {
    
    
    DogNotFoundException(String name) {
        super("There are no Dogs in the file system with the following name:  " + name);
    }
}
