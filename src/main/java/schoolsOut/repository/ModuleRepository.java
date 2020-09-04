package schoolsOut.repository;

import schoolsOut.model.Module;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class ModuleRepository {
    private EntityManager em;
    private EntityManagerProvider emp;

    public ModuleRepository() {
       emp=new EntityManagerProvider();
       em=emp.getEM();
    }


    public Module getModuleById(Long id) {
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
