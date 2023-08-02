package pd.project.universitydbmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pd.project.universitydbmanagement.model.Course;

public interface CourseRepository extends JpaRepository<Course,Integer> {
}
