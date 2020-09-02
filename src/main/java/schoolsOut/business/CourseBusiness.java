package schoolsOut.business;

import schoolsOut.model.Course;
import schoolsOut.repository.CourseRepository;
import java.util.List;

public class CourseBusiness {
    CourseRepository courseRepository = new CourseRepository();

    public Course getCourseById(int id) {
        return courseRepository.getCourseById(id);
    }


    public List<Course> getAllCourses() {
        return courseRepository.getAllCourses();
    }

    public Course saveCourse(Course course) {

        return courseRepository.saveCourse(course);
    }


    public void deleteCourse(Course course) {
        courseRepository.deleteCourse(course);

    }


}
