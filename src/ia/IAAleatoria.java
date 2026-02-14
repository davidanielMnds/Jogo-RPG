package ia;
import acoes.*;
import java.util.List;
import java.util.Random;

public class IAAleatoria implements IAinimigo {
    @Override
    public Acao DecidirAcao() {
        List<Acao> acoes = List.of(
            new AcaoAtaqueFisico(),
            new AcaoAtaqueMagico(),
            new AcaoCurar()
        );
        Random random = new Random();
        Acao acao = acoes.get(random.nextInt(acoes.size()));
       return acao;
    }
}
