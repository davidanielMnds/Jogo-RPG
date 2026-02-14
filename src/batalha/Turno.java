package batalha;
import acoes.Acao;
import personagem.Estado;
import personagem.Pessoa;
import ui.Battlelog;

public class Turno {
    private final Pessoa atual;
    private final Pessoa alvo;

    public Turno(Pessoa atual, Pessoa alvo) {
        this.atual=atual;
        this.alvo=alvo;
    }
    
    public void executar(Acao acao) {
        if (atual.VerificarEstado() == Estado.MORTO) {
            Battlelog.estado(atual.getNome() + " está morto e não pode agir.");
            return;
        }
        Estado estadoAntesAtual = atual.getEstado();
        Estado estadoAntesAlvo = alvo.getEstado();

        acao.executar(atual, alvo);
        atual.VerificarEstado();
        alvo.VerificarEstado();
        
        if (estadoAntesAlvo != alvo.getEstado()) {
            Battlelog.MudancaEstado(alvo, estadoAntesAlvo);
        }
        if (estadoAntesAtual != atual.getEstado()) {
            Battlelog.MudancaEstado(atual, estadoAntesAtual);
        }
    }
}
