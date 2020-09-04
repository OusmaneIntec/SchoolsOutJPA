package schoolsOut.repository;

import schoolsOut.model.Person;

import javax.persistence.EntityManager;
import java.util.List;

public class PersonRepository {

    private EntityManager em;
   private EntityManagerProvider emp;


    public PersonRepository() {
     emp=new EntityManagerProvider();
     em=emp.getEM();
    }


    public Person getPersonById(Long id) {

        return em.find(Person.class, id);
    }
    public List<Person> getAllPeople() {
        return em.createQuery("from Person", Person.class).getResultList();
    }

    public Person savePerson(Person person) {
        em.getTransaction().begin();
        if (person.getId() == null) {
            em.persist(person);
        } else {
            em.merge(person);
        }

        em.getTransaction().commit();
        return person;

    }



    public void deletePerson(Person person) {
        em.getTransaction().begin();
        em.remove(person);
        em.getTransaction().commit();

    }
}
