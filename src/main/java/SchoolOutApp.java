import org.hibernate.type.TrueFalseType;
import schoolsOut.business.CourseBusiness;
import schoolsOut.business.PersonBusiness;
import schoolsOut.business.UserBusiness;
import schoolsOut.model.Course;
import schoolsOut.model.Gender;
import schoolsOut.model.Person;
import schoolsOut.model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class SchoolOutApp {

    public static void main(String[] args) {
       PersonBusiness personBusiness =new PersonBusiness();
       Person person=personBusiness.getPersonById(18L);
        User user= new User()
                .setLogin("ousmaneDi")
                .setPasswordhash("intec-123")
                .setActive(true)
                .setPerson(person);
       person.setUser(user);
       personBusiness.savePerson(person);








    }
}
