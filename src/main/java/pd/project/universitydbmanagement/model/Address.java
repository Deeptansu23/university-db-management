package pd.project.universitydbmanagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "person")
public class Address extends Person{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column
    private int addressNo;
    @Column
    private String street;
    @Column
    private int apt_no;
    @Column
    private String city;
    @Column
    private String state;
    @Column
    private int zip;

}
