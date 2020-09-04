package schoolsOut.repository;

import schoolsOut.model.Course;
import schoolsOut.model.Exam;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class ExamRepository  {

    private EntityManager em;
    private EntityManagerProvider emp;

    public ExamRepository() {
        emp=new EntityManagerProvider();
        em=emp.getEM();
    }



    public Exam getExamById(Long id) {
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
