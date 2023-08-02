package pd.project.universitydbmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pd.project.universitydbmanagement.model.Person;

public interface PersonRepository extends JpaRepository<Person,Long> {

}
