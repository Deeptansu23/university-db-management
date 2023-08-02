package pd.project.universitydbmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pd.project.universitydbmanagement.model.Department;

public interface DepartmentRepository extends JpaRepository<Department,Integer> {


}
