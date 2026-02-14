package acoes;
import personagem.Pessoa;
import ui.Battlelog;

public class AcaoAtaqueFisico implements Acao{
    @Override
    public void executar(Pessoa ator, Pessoa alvo) {
        int dano = ator.AtaqueFisico(alvo.getTipo());
        Battlelog.linha();
        Battlelog.UsouAtaqueFisico(ator);
        alvo.LevarDano(dano);
        Battlelog.dano(dano);
    }
}