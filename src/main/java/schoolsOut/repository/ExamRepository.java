package schoolsOut.repository;

import schoolsOut.model.Course;
import schoolsOut.model.Exam;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class ExamRepository  {

    private EntityManagerFactory emf;
    private EntityManager em;

    public ExamRepository() {
        this.emf= Persistence.createEntityManagerFactory("datasource");
        this.em = emf.createEntityManager();
    }



    public Exam getExamById(int id) {
        return em.find(Exam.class, id);
    }


    public List<Exam> getAllExams() {
        return em.createQuery("from Exam", Exam.class).getResultList();
    }


    public Exam saveExam(Exam exam) {
        em.getTransaction().begin();
        em.persist(exam);
        em.getTransaction().commit();
        return exam ;
    }


    public void deleteExam(Exam exam) {
        em.getTransaction().begin();
        em.remove(exam);
        em.getTransaction().commit();

    }
}
