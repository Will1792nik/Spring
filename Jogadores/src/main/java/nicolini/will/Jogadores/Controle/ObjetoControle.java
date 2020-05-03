package nicolini.will.Jogadores.Controle;


import nicolini.will.Jogadores.Modelo.Jogadores;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController

public class ObjetoControle {
@GetMapping("/jogadores")
    public ArrayList<Jogadores> setJogadores(){
    Jogadores jogador1 = new Jogadores();
    jogador1.setNome("Cristiano Ronaldo");
    Jogadores jogador2 = new Jogadores();
    jogador2.setNome("Lionel Messi");
    Jogadores jogador3 = new Jogadores();
    jogador3.setNome("Neymar Jr.");
    ArrayList<Jogadores> nome = new ArrayList<>();
    nome.add(jogador1);
    nome.add(jogador2);
    nome.add(jogador3);
    return nome;
  }

  @GetMapping("/idade")
    public ArrayList<Jogadores> setIdade(){
    Jogadores idade1 = new Jogadores();
    idade1.setIdade("35 Anos");
    Jogadores idade2 = new Jogadores();
    idade2.setIdade("32 Anos");
    Jogadores idade3 = new Jogadores();
    idade3.setIdade("28 Anos");
    ArrayList<Jogadores> idade = new ArrayList<>();
    idade.add(idade1);
    idade.add(idade2);
    idade.add(idade3);
    return idade;
}

@GetMapping("/clube")
    public ArrayList<Jogadores> setClube(){
    Jogadores clube1 = new Jogadores();
    clube1.setClube("Juventus");
    Jogadores clube2 = new Jogadores();
    clube2.setClube("Barcelona");
    Jogadores clube3 = new Jogadores();
    clube3.setClube("Paris Saint German");
    ArrayList<Jogadores> clube = new ArrayList<>();
    clube.add(clube1);
    clube.add(clube2);
    clube.add(clube3);
    return clube;

}





























}
