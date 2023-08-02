package pd.project.universitydbmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pd.project.universitydbmanagement.model.Faculty;

public interface FacultyRepository extends JpaRepository<Faculty,Long> {
}
