package prueProyec1.index.controller;

import org.springframework.web.bind.annotation.RestController;

import prueProyec1.index.modelos.usuarios;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class controller_usuarios {

    @GetMapping("/usuario")
    public usuarios getMethod(String nombre, String apellido, Integer cedula) {
        return new usuarios(nombre, apellido, cedula);
    }
    

}
