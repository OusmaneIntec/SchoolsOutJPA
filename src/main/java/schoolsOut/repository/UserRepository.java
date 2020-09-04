package schoolsOut.repository;
import schoolsOut.model.User;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class UserRepository {
    private EntityManager em;
    private EntityManagerProvider emp;

    public UserRepository() {
          emp=new EntityManagerProvider();
          em=emp.getEM();
    }


    public User getUserByLogin(String login) {
        return em.find(User.class, login);
    }


    public List<User> getAllUsers() {
        return em.createQuery("from User", User.class).getResultList();
    }

    public User saveUser(User user) {
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
        return user;
    }


    public void deleteUser(User user) {
        em.getTransaction().begin();
        em.remove(user);
        em.getTransaction().commit();

    }
}
