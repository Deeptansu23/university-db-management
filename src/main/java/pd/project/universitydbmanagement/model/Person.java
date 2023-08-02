package pd.project.universitydbmanagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ssn")
    private  Long ssn;
    @Column(name = "person_bDate")
    private Data person_bDate;
    @Column(name = "person_sex")
    private String person_sex;
    @Autowired
    @Column(name = "person_name")
    private Name person_name;
    @Autowired
    @Column(name = "person_address")
    private Address person_address;

}
