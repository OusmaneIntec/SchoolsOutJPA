package schoolsOut.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerProvider {
    private static EntityManagerFactory emf;

    public EntityManagerProvider() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory("datasource");
        }

    }

    public EntityManager getEM() {

        return emf.createEntityManager();
    }
}
