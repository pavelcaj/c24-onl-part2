package lesson43;

import lesson43.dao.PersonDAO;
import lesson43.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import javax.sql.DataSource;
import java.util.List;

@SpringBootApplication
public class Main implements CommandLineRunner {

    @Autowired
    private PersonDAO personDAO;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Person newPerson = new Person();
        newPerson.setName("John Doe");
        newPerson.setAge(25);
        personDAO.addPerson(newPerson);

        Person retrievedPerson = personDAO.getPersonById(1L);
        if (retrievedPerson != null) {
            System.out.println("Retrieved Person: " + retrievedPerson.getName() + ", Age: " + retrievedPerson.getAge());
        }

        if (retrievedPerson != null) {
            retrievedPerson.setAge(26);
            personDAO.updatePerson(retrievedPerson);
            System.out.println("Updated Person: " + retrievedPerson.getName() + ", Age: " + retrievedPerson.getAge());
        }

        personDAO.deletePerson(1L);

        List<Person> allPersons = personDAO.getAllPersons();
        System.out.println("All Persons:");
        for (Person person : allPersons) {
            System.out.println("Person: " + person.getName() + ", Age: " + person.getAge());
        }
    }

    @Bean
    public LocalSessionFactoryBean sessionFactory() {
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        sessionFactory.setPackagesToScan("lesson43.model");
        return sessionFactory;
    }

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.h2.Driver");
        dataSource.setUrl("jdbc:h2:mem:testdb");
        dataSource.setUsername("sa");
        dataSource.setPassword("");
        return dataSource;
    }
}