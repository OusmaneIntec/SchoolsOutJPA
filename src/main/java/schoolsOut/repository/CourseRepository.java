package schoolsOut.repository;

import schoolsOut.model.Course;
import schoolsOut.model.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class CourseRepository  {
    private EntityManagerFactory emf;
    private EntityManager em;

    public CourseRepository() {
        this.emf= Persistence.createEntityManagerFactory("datasource");
        this.em = emf.createEntityManager();
    }



    public Course getCourseById(int id) {
        return em.find(Course.class, id);
    }


    public List<Course> getAllCourses() {
        return em.createQuery("from Course", Course.class).getResultList();
    }

    public Course saveCourse(Course course) {
        em.getTransaction().begin();
        em.persist(course);
        em.getTransaction().commit();
        return course ;
    }

    public void deleteCourse(Course course) {
        em.getTransaction().begin();
        em.remove(course);
        em.getTransaction().commit();

    }
}
