package acoes;
import personagem.Pessoa;

public interface Acao {
    void executar(Pessoa ator, Pessoa alvo);
}
