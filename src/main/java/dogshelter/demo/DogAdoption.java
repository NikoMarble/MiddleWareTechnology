package dogshelter.demo;

import java.sql.Date;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;


@Entity
public class DogAdoption {

    private @jakarta.persistence.Id @GeneratedValue Long Id;
    private Long dogId;
    private String dogname;
    private String breed;
    private String owner;
    //private LocalDateTime dateofadoption;

    public DogAdoption(Long dogId, String dogname, String breed, String owner) {
        this.dogId=dogId;
        this.dogname=dogname;
        this.breed=breed;
        this.owner=owner;
    }

    public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Long getDogId() {
		return dogId;
	}

	public void setDogId(Long dogId) {
		this.dogId = dogId;
	}

	public String getDogname() {
		return dogname;
	}

	public void setDogname(String dogname) {
		this.dogname = dogname;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public DogAdoption(Long id, Long dogId, String dogname, String breed, String owner) {
		super();
		Id = id;
		this.dogId = dogId;
		this.dogname = dogname;
		this.breed = breed;
		this.owner = owner;
	}
 
    @Override
	public String toString() {
		return "DogAdoption [Id=" + Id + ", dogId=" + dogId + ", dogname=" + dogname + ", breed=" + breed + ", owner="
				+ owner + "]";
	}

	//@Override
	//public int hashCode() {
	//	return Objects.hash(Id, breed, dogId, dogname, owner); }
	

	
	
}
