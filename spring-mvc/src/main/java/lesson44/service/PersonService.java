package lesson44.service;

import lesson44.model.Person;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
@Transactional
public class PersonService {

    @PersistenceContext
    private EntityManager entityManager;

    public void addPerson(Person person) {
        entityManager.persist(person);
    }

    public Person getPersonById(Long id) {
        return entityManager.find(Person.class, id);
    }

    public List<Person> getAllPersons() {
        return entityManager.createQuery("FROM Person", Person.class).getResultList();
    }

    public void updatePerson(Person person) {
        entityManager.merge(person);
    }

    public void deletePerson(Long id) {
        Person person = getPersonById(id);
        if (person != null) {
            entityManager.remove(person);
        }
    }
}