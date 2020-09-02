import org.hibernate.type.TrueFalseType;
import schoolsOut.business.PersonBusiness;
import schoolsOut.model.Gender;
import schoolsOut.model.Person;
import schoolsOut.model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class SchoolOutApp {

    public static void  main (String[] args){

       PersonBusiness personBusiness=new PersonBusiness();

        Person p=new Person()
                .setFirstName("Alpha")
                .setLastName("Diallo")
                .setGender(Gender.M);
        personBusiness.savePerson(p);
      //  Person person=personBusiness.getById(7);
       // personBusiness.deletePerson(person);
        List<Person> people= personBusiness.getAllPeople();
      //  people.forEach(System.out::println);

        //PersonBusiness personBusiness=new PersonBusiness();
      // Person person1= personBusiness.getPersonById(8);
      //  System.out.println(person1.toString());



    }
}
