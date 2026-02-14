package factory;
import java.util.List;
import java.util.Random;
import personagem.Pessoa;
import personagem.classes.*;

public class GeradorInimigos {
    public static Pessoa GerarInimigo() {
        List<Pessoa> gerado = List.of(
            new Zumbi("Zumbi"),
            new Esqueleto("Esqueleto"),
            new Golem("Golem"),
            new Vampiro("Vampiro")
        );
        Random random = new Random();
        return gerado.get(random.nextInt(gerado.size()));
    }
}
