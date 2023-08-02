package pd.project.universitydbmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pd.project.universitydbmanagement.model.Person;
import pd.project.universitydbmanagement.service.PersonService;

import java.util.List;


@RestController
public class PersonController {


    @Autowired
    private PersonService personService;


    public PersonController(PersonService personService){
        this.personService=personService;
    }


    @GetMapping("/addperson")
    public List<Person> getAllPerson(){
        return personService.geAllPerson();
    }


    @GetMapping("/getperson")
    public Person getCollege(@PathVariable Long ssn){
        return personService.getPerson(ssn);

    }
    @PostMapping("/addperson")
    public void addPerson(@RequestBody Person person){
        personService.addPerson(person);
    }


    @PutMapping
    public ResponseEntity<Person> updatePerson(@RequestBody Person person, @PathVariable Long ssn){
        Person existPerson=personService.getPerson(ssn);
        existPerson.setPerson_name(person.getPerson_name());
        existPerson.setPerson_bDate(person.getPerson_bDate());
        existPerson.setPerson_sex(person.getPerson_sex());
        existPerson.setPerson_address(person.getPerson_address());
        personService.updatePerson(existPerson);
        return new ResponseEntity<>(HttpStatus.OK);
    }


    @DeleteMapping
    public void deletePerson(@PathVariable Long ssn){
        personService.deletePersonById(ssn);
    }

}
