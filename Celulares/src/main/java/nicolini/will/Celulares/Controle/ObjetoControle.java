package nicolini.will.Celulares.Controle;


import nicolini.will.Celulares.Modelo.Celulares;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ObjetoControle {
    @GetMapping("/modelo")
    public ArrayList<Celulares> setModelos() {
        Celulares modelo1 = new Celulares();
        modelo1.setModelo("Galaxy S10+");
        Celulares modelo2 = new Celulares();
        modelo2.setModelo("iPhone XR");
        Celulares modelo3 = new Celulares();
        modelo3.setModelo("MI 10 PRO");
        ArrayList<Celulares> modelos = new ArrayList<>();
        modelos.add(modelo1);
        modelos.add(modelo2);
        modelos.add(modelo3);
        return modelos;
    }
    @GetMapping("/marca")
    public ArrayList<Celulares> setMarcas(){
        Celulares marca1 = new Celulares();
        marca1.setMarca("Samsung");
        Celulares marca2 = new Celulares();
        marca2.setMarca("Apple");
        Celulares marca3 = new Celulares();
        marca3.setMarca("XIAOMI");
        ArrayList<Celulares> marcas = new ArrayList<>();
        marcas.add(marca1);
        marcas.add(marca2);
        marcas.add(marca3);
        return marcas;
    }
}
