package pd.project.universitydbmanagement.service;

import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pd.project.universitydbmanagement.exception.CollegeAlreadyExistException;
import pd.project.universitydbmanagement.exception.NosuchCollegeExistsException;
import pd.project.universitydbmanagement.model.College;
import pd.project.universitydbmanagement.repository.CollegeRepository;

import java.util.ArrayList;
import java.util.List;


@Service
public class CollegeService {

    @Autowired
    private CollegeRepository collegeRepository;

    public CollegeService(CollegeRepository collegeRepository){
        this.collegeRepository=collegeRepository;
    }

    public College getCollege(Long id){
        return collegeRepository.findById(id).orElseThrow(
                ()-> new NosuchCollegeExistsException("No such college exist"+ id)
        );
    }
    public String addCollege(College college){
        College existCollege=collegeRepository.findById(college.getId())
                .orElse(null);
        if (existCollege==null){
            collegeRepository.save(college);
            return "College added successfully";
        }
        else {
            throw new CollegeAlreadyExistException("Department already exists");

        }


    }
    public String updateCollege(College college){
        College existCollege=collegeRepository.findById(college.getId())
                .orElse(null);
        if (existCollege==null){
            throw new NosuchCollegeExistsException("No such college exists");
        }
        else {
            existCollege.setCollege_dean(college.getCollege_dean());
            existCollege.setCollege_name(college.getCollege_name());
            existCollege.setCollege_office(college.getCollege_office());
            collegeRepository.save(existCollege);
            return "College updated successfully";
        }
    }

    public List<College> geAllCollege(){
        List<College> colleges=new ArrayList<College>();
        collegeRepository.findAll().forEach(college-> colleges.add(college));
        return colleges;
    }
    public void deleteCollegeById(Long id){
        collegeRepository.deleteById(id);
    }

}
