package prueProyec1.index;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class IndexApplication {

	public static void main(String[] args) {
		SpringApplication.run(IndexApplication.class, args);
	}
	@GetMapping("/hola")
    public String hola(@RequestParam(value = "name", defaultValue = "mundo") String name) {
      return String.format("hola %s!", name);
	  //ahora dira adios 
    }
	@GetMapping("/adios")
    public String adios(@RequestParam(value = "name", defaultValue = "mundo cruel") String name) {
      return String.format("adios %s!", name);
    }
}

