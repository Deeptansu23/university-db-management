package pd.project.universitydbmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pd.project.universitydbmanagement.repository.FacultyRepository;
import pd.project.universitydbmanagement.repository.PersonRepository;

@SpringBootApplication
public class UniversityDbManagementApplication {
	static PersonRepository personRepository;
	static FacultyRepository facultyRepository;



	public static void main(String[] args) {

		SpringApplication.run(UniversityDbManagementApplication.class, args);


	}

}
