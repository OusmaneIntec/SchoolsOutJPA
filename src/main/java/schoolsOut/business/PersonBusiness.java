package schoolsOut.business;

import schoolsOut.model.Person;
import schoolsOut.repository.PersonRepository;
import java.util.List;

public class PersonBusiness {
    PersonRepository personRepository = new PersonRepository();

    public Person getPersonById(int id) {
        return personRepository.getPersonById(id);
    }


    public List<Person> getAllPeople() {
        return personRepository.getAllPeople();
    }

    public Person savePerson(Person person) {

        return personRepository.savePerson(person);
    }


    public void deletePerson(Person person) {
        personRepository.deletePerson(person);

    }
}
