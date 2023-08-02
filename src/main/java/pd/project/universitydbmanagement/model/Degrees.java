package pd.project.universitydbmanagement.model;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Degrees {
    @Column(name = "degree_college")
    private String degree_college;
    @Column(name = "degree")
    private String degree;
    @Column(name = "degree_year")
    private int degree_year;

}
