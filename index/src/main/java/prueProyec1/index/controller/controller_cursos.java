package prueProyec1.index.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import prueProyec1.index.modelos.cursos;

@RestController
public class controller_cursos {
@GetMapping("/cursos")
    public cursos cursos (Integer id, String nombre, String descripcios) {
        return new cursos(id, nombre, descripcios);
    }
}
