package batalha;
import acoes.*;
import ia.IAAleatoria;
import personagem.Estado;
import personagem.Pessoa;

public class Combate {

    private final IAAleatoria iaInimigo = new IAAleatoria();

    public void ExecutarTurno(Acao acaoJogador, Pessoa jogador, Pessoa inimigo) {
        //Turno do jogador
        Turno turnoJogador = new Turno(jogador, inimigo);
        turnoJogador.executar(acaoJogador);
        //Turno do inimigo
        if(inimigo.getEstado() == Estado.MORTO) { return;}
        Acao acaoInimigo = iaInimigo.DecidirAcao();
        Turno turnoInimigo = new Turno(inimigo, jogador);
        turnoInimigo.executar(acaoInimigo);
    }
}