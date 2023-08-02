package pd.project.universitydbmanagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "dept_id")
    private Integer dept_id;
    @Column(name = "dept_Name")
    private String dept_Name;
    @Column(name = "dept_Phone")
    private Long dept_Phone;
    @Column(name = "dept_office")
    private String dept_office;

}
