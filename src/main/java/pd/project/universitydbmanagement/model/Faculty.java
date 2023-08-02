package pd.project.universitydbmanagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "faculty")
public class Faculty {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "faculty_rank")
    private Integer faculty_rank;
    @Column(name = "faculty_Office")
    private String faculty_Office;
    @Column(name = "faculty_Phone")
    private Long faculty_Phone;
    @Column(name = "faculty_salary")
    private Long faculty_salary;



}
