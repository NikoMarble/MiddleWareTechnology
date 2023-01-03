package dogshelter.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

interface DogRepo extends JpaRepository<DogAdoption, Long>{
   
  @Query(value = "SELECT * FROM dogadoption WHERE id = :id", nativeQuery = true)
  List <DogAdoption> findAllEntriesPerId(@Param("id") Long id);

}