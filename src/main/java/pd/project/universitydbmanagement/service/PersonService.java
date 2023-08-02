package pd.project.universitydbmanagement.service;

import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pd.project.universitydbmanagement.exception.CollegeAlreadyExistException;
import pd.project.universitydbmanagement.exception.NosuchCollegeExistsException;
import pd.project.universitydbmanagement.exception.NosuchPersonExistsException;
import pd.project.universitydbmanagement.exception.PersonAlreadyExistException;
import pd.project.universitydbmanagement.model.College;
import pd.project.universitydbmanagement.model.Person;
import pd.project.universitydbmanagement.repository.CollegeRepository;
import pd.project.universitydbmanagement.repository.PersonRepository;

import java.util.ArrayList;
import java.util.List;


@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public PersonService(PersonRepository personRepository){
        this.personRepository=personRepository;
    }
    public Person getPerson(Long ssn){
        return personRepository.findById(ssn).orElseThrow(
                ()-> new NosuchPersonExistsException("No such Person exist"+ ssn)
        );
    }
    public String addPerson(Person person){
        Person existPerson=personRepository.findById(person.getSsn())
                .orElse(null);
        if (existPerson==null){
            personRepository.save(person);
            return "Person added successfully";
        }
        else {
            throw new PersonAlreadyExistException("Person already exists");

        }


    }
    public String updatePerson(Person person){
        Person existPerson=personRepository.findById(person.getSsn())
                .orElse(null);
        if (existPerson==null){
            throw new NosuchPersonExistsException("No such Person exists");
        }
        else {
            existPerson.setPerson_name(person.getPerson_name());
            existPerson.setPerson_bDate(person.getPerson_bDate());
            existPerson.setPerson_sex(person.getPerson_sex());
            existPerson.setPerson_address(person.getPerson_address());
            personRepository.save(existPerson);
            return "Person updated successfully";
        }

    }
    public List<Person> geAllPerson(){
        List<Person> personList=new ArrayList<Person>();
        personRepository.findAll().forEach(college-> personList.add(college));
        return personList;
    }
    public void deletePersonById(Long ssn){
        personRepository.deleteById(ssn);
    }

}
