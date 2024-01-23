package lesson44;

import lesson44.model.Person;
import lesson44.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Main implements CommandLineRunner {

    @Autowired
    private PersonService personService;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Person newPerson = new Person();
        newPerson.setName("John Doe");
        newPerson.setAge(25);
        personService.addPerson(newPerson);

        Person retrievedPerson = personService.getPersonById(1L);
        if (retrievedPerson != null) {
            System.out.println("Retrieved Person: " + retrievedPerson.getName() + ", Age: " + retrievedPerson.getAge());
        }

        if (retrievedPerson != null) {
            retrievedPerson.setAge(26);
            personService.updatePerson(retrievedPerson);
            System.out.println("Updated Person: " + retrievedPerson.getName() + ", Age: " + retrievedPerson.getAge());
        }

        personService.deletePerson(1L);

        List<Person> allPersons = personService.getAllPersons();
        System.out.println("All Persons:");
        for (Person person : allPersons) {
            System.out.println("Person: " + person.getName() + ", Age: " + person.getAge());
        }
    }
}