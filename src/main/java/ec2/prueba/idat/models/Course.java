package ec2.prueba.idat.models;

import jakarta.persistence.*;

@Entity(name = "cursos")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id;

    @Column(name = "nombre", length = 200)
    public String name;

    @Column(name = "creditos")
    public int credits;

}
