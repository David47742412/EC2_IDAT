package ec2.prueba.idat.repository;

import ec2.prueba.idat.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourse extends JpaRepository<Course, Integer> {

}
