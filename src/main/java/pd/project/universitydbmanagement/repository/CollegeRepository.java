package pd.project.universitydbmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pd.project.universitydbmanagement.model.College;

@Repository
public interface CollegeRepository extends JpaRepository<College,Long> {


}
