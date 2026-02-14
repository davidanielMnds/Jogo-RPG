package acoes;
import personagem.Pessoa;
import ui.Battlelog;

public class AcaoAtaqueMagico implements Acao{
    @Override
    public void executar(Pessoa ator, Pessoa alvo) {
        int pmAntes = ator.getMana();
        int dano = ator.AtaqueMagico(alvo.getTipo());
        Battlelog.linha();
        alvo.LevarDano(dano);
        if (pmAntes > ator.getMana()) {
            Battlelog.UsouAtaqueMagico(ator);
            Battlelog.dano(dano);
        }
    }
}