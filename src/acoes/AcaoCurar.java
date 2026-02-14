package acoes;
import personagem.Pessoa;
import ui.Battlelog;

public class AcaoCurar implements Acao {
    @Override
    public void executar(Pessoa ator, Pessoa alvo) {
        Battlelog.linha();
        int vidaAntes = ator.getVida();
        ator.Curar();
        if (vidaAntes < ator.getVida()) {
            Battlelog.UsouCura(ator);
            Battlelog.QuantidadeCurada(ator.getCura());
        }
        Battlelog.linha();
    }
}
