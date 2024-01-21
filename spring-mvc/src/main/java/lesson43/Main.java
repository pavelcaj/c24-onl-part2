package lesson43;

import lesson43.dao.PersonDAO;
import lesson43.model.Person;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PersonDAO personDAO = new PersonDAO();

        Person newPerson = new Person();
        newPerson.setName("John Doe");
        newPerson.setAge(25);
        personDAO.addPerson(newPerson);

        Person retrievedPerson = personDAO.getPersonById(1);
        System.out.println("Retrieved Person: " + retrievedPerson.getName() + ", Age: " + retrievedPerson.getAge());

        retrievedPerson.setAge(26);
        personDAO.updatePerson(retrievedPerson);

        retrievedPerson = personDAO.getPersonById(1);
        System.out.println("Updated Person: " + retrievedPerson.getName() + ", Age: " + retrievedPerson.getAge());

        personDAO.deletePerson(1);

        List<Person> allPersons = personDAO.getAllPersons();
        System.out.println("All Persons:");
        for (Person person : allPersons) {
            System.out.println("Person: " + person.getName() + ", Age: " + person.getAge());
        }
        personDAO.close();
    }
}