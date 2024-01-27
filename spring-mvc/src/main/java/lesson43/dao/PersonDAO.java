package lesson43.dao;

import lesson43.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class PersonDAO {

    private final SessionFactory sessionFactory;

    @Autowired
    public PersonDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void addPerson(Person person) {
        getCurrentSession().save(person);
    }

    public Person getPersonById(Long id) {
        return getCurrentSession().get(Person.class, id);
    }

    public List<Person> getAllPersons() {
        return getCurrentSession().createQuery("FROM Person", Person.class).list();
    }

    public void updatePerson(Person person) {
        getCurrentSession().update(person);
    }

    public void deletePerson(Long id) {
        Person person = getPersonById(id);
        if (person != null) {
            getCurrentSession().delete(person);
        }
    }

    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }
}