package schoolsOut.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public interface EntityRepository<T> {
    T getById(int id);

     List<T> getAll();
    T save(T entity);

    void delete(T entity);
}
