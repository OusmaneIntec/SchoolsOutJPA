package schoolsOut.repository;

import schoolsOut.model.Module;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class ModuleRepository {
    private EntityManagerFactory emf;
    private EntityManager em;

    public ModuleRepository() {
        this.emf= Persistence.createEntityManagerFactory("datasource");
        this.em = emf.createEntityManager();
    }


    public Module getModuleById(int id) {
        return em.find(Module.class, id);
    }


    public List<Module> getAllModules() {
        return em.createQuery("from Course", Module.class).getResultList();
    }


    public Module saveModule(Module module) {
        em.getTransaction().begin();
        em.persist(module);
        em.getTransaction().commit();
        return module ;
    }


    public void deleteModule(Module module) {
        em.getTransaction().begin();
        em.remove(module);
        em.getTransaction().commit();

    }
}
