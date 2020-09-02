package schoolsOut.business;

import schoolsOut.model.Exam;
import schoolsOut.repository.ExamRepository;
import java.util.List;

public class ExamBusiness {
    ExamRepository examRepository = new ExamRepository();

    public Exam getExamById(int id) {

        return examRepository.getExamById(id);
    }


    public List<Exam> getAllExams() {

        return examRepository.getAllExams();
    }

    public Exam saveExam(Exam exam) {

        return examRepository.saveExam(exam);
    }


    public void deleteExam(Exam exam) {
        examRepository.deleteExam(exam);

    }
}
