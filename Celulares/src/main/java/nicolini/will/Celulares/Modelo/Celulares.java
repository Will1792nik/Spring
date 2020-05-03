package nicolini.will.Celulares.Modelo;

import lombok.*;

/**
 * @author williamnicolini
 * @since 30/04/2020 20:11
 * @version Gradle/Lombok Celulares 1.0
 */

@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Celulares {
    @Getter @Setter
    private String modelo;
    @Getter @Setter
    private String marca;
}
