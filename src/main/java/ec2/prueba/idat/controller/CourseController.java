package ec2.prueba.idat.controller;

import ec2.prueba.idat.models.Course;
import ec2.prueba.idat.repository.ICourse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController("api/curso")
public class CourseController {

    private final ICourse _repository;

    public CourseController(ICourse repository) {
        _repository = repository;
    }

    @GetMapping("/listar")
    public List<Course> Index() {
        return this._repository.findAll();
    }

    @GetMapping("/nuevo")
    public Optional<Course> NewCourse(@RequestBody() Course course) {
        _repository.save(course);
        return this._repository.findById(course.id);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Object> Delete(@PathVariable Integer id) {
        _repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
