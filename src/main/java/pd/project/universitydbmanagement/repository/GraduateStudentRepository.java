package pd.project.universitydbmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pd.project.universitydbmanagement.model.GraduateStudent;


public interface GraduateStudentRepository extends JpaRepository<GraduateStudent,Integer> {
}
