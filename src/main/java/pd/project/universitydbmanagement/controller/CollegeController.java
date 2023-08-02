package pd.project.universitydbmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pd.project.universitydbmanagement.model.College;
import pd.project.universitydbmanagement.service.CollegeService;

import java.util.List;


@RestController
public class CollegeController {

    @Autowired
    private CollegeService collegeService;


    public CollegeController(CollegeService collegeService){
        this.collegeService=collegeService;
    }


    @GetMapping("/addcollege")
    public List<College> getAllCollege(){
        return collegeService.geAllCollege();
    }


    @GetMapping("/getcollege")
    public College getCollege(@PathVariable Long id){
        return collegeService.getCollege(id);
    }


    @PostMapping("/addcollege")
    public void addCollege(@RequestBody College college){
        collegeService.addCollege(college);
    }


    @PutMapping
    public ResponseEntity<College> updateCollege(@RequestBody College college, @PathVariable Long id){
        College existCollege=collegeService.getCollege(id);
        existCollege.setCollege_name(college.getCollege_name());
        existCollege.setCollege_dean(college.getCollege_dean());
        existCollege.setCollege_office(college.getCollege_office());
        collegeService.updateCollege(existCollege);
        return new ResponseEntity<>(HttpStatus.OK);
    }


    @DeleteMapping
    public void deleteCollege(@PathVariable Long id){
        collegeService.deleteCollegeById(id);
    }

}
