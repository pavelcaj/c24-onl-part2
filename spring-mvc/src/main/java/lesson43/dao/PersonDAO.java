package lesson43.dao;

import lesson43.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class PersonDAO {

    private final SessionFactory factory;

    public PersonDAO() {
        Configuration configuration = new Configuration().configure();
        factory = configuration.buildSessionFactory();
    }

    public void addPerson(Person person) {
        try (Session session = factory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(person);
            transaction.commit();
        }
    }

    public Person getPersonById(int id) {
        try (Session session = factory.openSession()) {
            return session.get(Person.class, id);
        }
    }

    public List<Person> getAllPersons() {
        try (Session session = factory.openSession()) {
            return session.createQuery("FROM Person", Person.class).list();
        }
    }

    public void updatePerson(Person person) {
        try (Session session = factory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.update(person);
            transaction.commit();
        }
    }

    public void deletePerson(int id) {
        try (Session session = factory.openSession()) {
            Transaction transaction = session.beginTransaction();
            Person person = session.get(Person.class, id);
            if (person != null) {
                session.delete(person);
            }
            transaction.commit();
        }
    }

    public void close() {
        factory.close();
    }
}