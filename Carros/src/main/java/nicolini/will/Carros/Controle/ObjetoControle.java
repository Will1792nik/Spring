package nicolini.will.Carros.Controle;

import nicolini.will.Carros.Modelo.Carros;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController

public class ObjetoControle {
   @GetMapping("/carros")
   public ArrayList<Carros> setCarros(){
       Carros carro1 = new Carros();
       carro1.setCarro("Mercedes C180");
       Carros carro2 = new Carros();
       carro2.setCarro("Fiesta");
       Carros carro3 = new Carros();
       carro3.setCarro("Evoque");
       ArrayList<Carros> modelos = new ArrayList<>();
       modelos.add(carro1);
       modelos.add(carro2);
       modelos.add(carro3);
       return modelos;
   }
  @GetMapping("/marcas")
    public ArrayList<Carros> setMarcas(){
       Carros marca1 = new Carros();
       marca1.setMarca("Mercedes-Benz");
       Carros marca2 = new Carros();
       marca2.setMarca("Ford");
       Carros marca3 = new Carros();
       marca3.setMarca("Land Rover");
       ArrayList<Carros> marcas = new ArrayList<>();
       marcas.add(marca1);
       marcas.add(marca2);
       marcas.add(marca3);
       return marcas;
  }
}
