package nicolini.will.Carros.Modelo;

import lombok.*;

/**
 * @author williamnicolini
 * @since 30/04/2020 18:39
 * @version Gradle/Lombok Carros 1.0
 */

@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Carros {
    @Getter @Setter
    private String carro;
    @Getter @Setter
    private String marca;
}
