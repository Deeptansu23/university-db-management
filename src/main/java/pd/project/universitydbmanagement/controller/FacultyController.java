package pd.project.universitydbmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pd.project.universitydbmanagement.model.College;
import pd.project.universitydbmanagement.model.Faculty;
import pd.project.universitydbmanagement.service.CollegeService;
import pd.project.universitydbmanagement.service.FacultyService;

import java.util.List;


@RestController
public class FacultyController {

    @Autowired
    private FacultyService facultyService;

    public FacultyController(FacultyService facultyService){
        this.facultyService=facultyService;
    }

    @GetMapping("/faculty")
    public List<Faculty> getAllFaculty(){
        return facultyService.geAllFaculty();
    }


    @GetMapping("/getfaculty")
    public Faculty getFaculty(@PathVariable Long id){
        return facultyService.getFaculty(id);

    }


    @PostMapping("/addfaculty")
    public void addFaculty(@RequestBody Faculty faculty){
        facultyService.addFaculty(faculty);
    }
    @PutMapping
    public ResponseEntity<Faculty> updateFaculty(@RequestBody Faculty faculty, @PathVariable Long id){
        Faculty existFaculty=facultyService.getFaculty(id);
        existFaculty.setFaculty_rank(faculty.getFaculty_rank());
        existFaculty.setFaculty_Office(faculty.getFaculty_Office());
        existFaculty.setFaculty_Phone(faculty.getFaculty_Phone());
        existFaculty.setFaculty_salary(faculty.getFaculty_salary());
        facultyService.updateFaculty(faculty);
        return new ResponseEntity<>(HttpStatus.OK);
    }


    @DeleteMapping("/deletefaculty/{id}")
    public void deleteFaculty(@PathVariable("id") Long id){
        facultyService.deleteFacultyById(id);
    }

}
