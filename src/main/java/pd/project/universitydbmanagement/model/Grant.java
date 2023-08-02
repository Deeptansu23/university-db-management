package pd.project.universitydbmanagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "grant")
public class Grant {

    @Column(name = "grant_title")
    private String grant_title;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "grant_no")
    private Integer grant_no;
    @Column(name = "agency")
    private String agency;
    @Column(name = "st_date")
    private Date st_date;
}
