package ec2.prueba.idat.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController("/")
public class BaseController {

    @GetMapping()
    public ResponseEntity<Object> Index() {
        Map<String, Object> im = new HashMap<>();
        im.put("Codigo", "PI74465072");
        im.put("Nombre", "Darwin David Castro Astudillo");
        return ResponseEntity.ok().body(im);
    }

    @GetMapping("/idat/codigo")
    public ResponseEntity<Object> Code() {
        Map<String, Object> im = new HashMap<>();
        im.put("Codigo", "PI74465072");
        return ResponseEntity.ok().body(im);
    }

    @GetMapping("/idat/nombre-completo")
    public ResponseEntity<Object> Name() {
        Map<String, Object> im = new HashMap<>();
        im.put("Nombre", "Darwin David Castro Astudillo");
        return ResponseEntity.ok().body(im);
    }
}
