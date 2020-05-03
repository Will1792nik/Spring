package nicolini.will.Celulares.Controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControle {
    @GetMapping("/")
    public String getMensagem(){
        return "Lista de Celulares";
    }
}
