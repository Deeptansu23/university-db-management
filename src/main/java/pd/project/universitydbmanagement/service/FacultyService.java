package pd.project.universitydbmanagement.service;

import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pd.project.universitydbmanagement.exception.FacultyAlreadyExistException;
import pd.project.universitydbmanagement.exception.NosuchFacultyExistsException;
import pd.project.universitydbmanagement.model.Faculty;
import pd.project.universitydbmanagement.repository.FacultyRepository;

import java.util.ArrayList;
import java.util.List;


@Service
public class FacultyService {

    @Autowired
    private FacultyRepository facultyRepository;


    public FacultyService(FacultyRepository facultyRepository){
        this.facultyRepository=facultyRepository;
    }
    public Faculty getFaculty(Long id){
        return facultyRepository.findById(id).orElseThrow(
                ()-> new NosuchFacultyExistsException("No such faculty exist"+ id)
        );
    }
    public String addFaculty(Faculty faculty){
        Faculty existFaculty=facultyRepository.findById(faculty.getId())
                .orElse(null);
        if (existFaculty==null){
            facultyRepository.save(faculty);
            return "Faculty added successfully";
        }
        else {
            throw new FacultyAlreadyExistException("Faculty already exists");

        }


    }
    public String updateFaculty(Faculty faculty){
        Faculty existFaculty=facultyRepository.findById(faculty.getId())
                .orElse(null);
        if (existFaculty==null){
            throw new NosuchFacultyExistsException("No such faculty exists");
        }
        else {
            existFaculty.setFaculty_rank(faculty.getFaculty_rank());
            existFaculty.setFaculty_Office(faculty.getFaculty_Office());
            existFaculty.setFaculty_Phone(faculty.getFaculty_Phone());
            existFaculty.setFaculty_salary(faculty.getFaculty_salary());

            facultyRepository.save(existFaculty);
            return "faculty updated successfully";
        }

    }
    public List<Faculty> geAllFaculty(){
        List<Faculty> faculties=new ArrayList<Faculty>();
        facultyRepository.findAll().forEach(faculty-> faculties.add(faculty));
        return faculties;
    }
    public void deleteFacultyById(Long id){
        facultyRepository.deleteById(id);
    }

}
