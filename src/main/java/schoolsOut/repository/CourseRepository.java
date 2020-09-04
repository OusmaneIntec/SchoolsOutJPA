package schoolsOut.repository;

import schoolsOut.model.Course;
import schoolsOut.model.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class CourseRepository  {
    private EntityManager em;
    private EntityManagerProvider emp;

    public CourseRepository() {
        emp=new EntityManagerProvider();
        em=emp.getEM();
    }



    public Course getCourseById(Long id) {
        return em.find(Course.class, id);
    }


    public List<Course> getAllCourses() {
        return em.createQuery("from Course", Course.class).getResultList();
    }

    public Course saveCourse(Course course) {
        em.getTransaction().begin();
        if(course.getId()==null) {
            em.persist(course);
        }else {
            em.merge(course);
        }
        em.getTransaction().commit();
        return course ;
    }

    public void deleteCourse(Course course) {
        em.getTransaction().begin();
        em.remove(course);
        em.getTransaction().commit();

    }
}
