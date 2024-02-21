package prueProyec1.index.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class vistas {
    @GetMapping("/adios")
    public String adios(@RequestParam(value = "name", defaultValue = "mundo cruel") String name) {
      return String.format("adios %s!", name);
    }

}
