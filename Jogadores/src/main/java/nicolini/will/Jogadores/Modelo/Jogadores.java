package nicolini.will.Jogadores.Modelo;

import lombok.*;

/**
 @author williamnicolini
 @since 30/04/2020 17:18
 @version Gradle/Lombok Jogadores 1.0
 */

@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Jogadores {
        @Getter @Setter
        private String nome;
        @Getter @Setter
        private String idade;
        @Getter @Setter
        private String clube;
     }











