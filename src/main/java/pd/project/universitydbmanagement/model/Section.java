package pd.project.universitydbmanagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "section")
public class Section {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "section_id")
    private Integer section_id;
    @Column(name = "section_year")
    private int section_year;
    @Column(name = "section_Qtr")
    private int section_Qtr;


}
