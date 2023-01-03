package dogshelter;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import dogshelter.demo.Dog;
@RestController
@RequestMapping("/api/books")

public class DogController {

    @Autowired
    private DogRepo dogrepo;

    @GetMapping
    public Iterable findAll() {
        return dogrepo.findAll();
    }

    @GetMapping("/title/{bookTitle}")
    public List findByTitle(@PathVariable String bookTitle) {
        return dogrepo.findByTitle(bookTitle);
    }

    @GetMapping("/{id}")
    public Dog findOne(@PathVariable Long id) {
        return dogrepo.findById(id)
          .orElseThrow(DogNotFoundException::new);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Dog create(@RequestBody Dog dog) {
        return dogrepo.save(dog);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        dogrepo.findById(id)
          .orElseThrow(DogNotFoundException::new);
        dogrepo.deleteById(id);
    }

    @PutMapping("/{id}")
    public Dog updateDog(@RequestBody Dog dog @PathVariable Long id) {
        if (dog.getId() != id) {
          throw new DogIdMismatchException();
        }
        dogrepo.findById(id)
          .orElseThrow(DogNotFoundException::new);
        return dogrepo.save(dog);
    }
}