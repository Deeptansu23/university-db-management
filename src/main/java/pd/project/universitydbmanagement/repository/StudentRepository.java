package pd.project.universitydbmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pd.project.universitydbmanagement.model.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {


}
