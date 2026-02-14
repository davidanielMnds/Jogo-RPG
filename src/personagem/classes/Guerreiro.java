package personagem.classes;
import personagem.Pessoa;
import personagem.ataques.AtaquesFisicos;
import personagem.ataques.AtaquesMagicos;
import personagem.ataques.Cura;

public class Guerreiro extends Pessoa{    
    public Guerreiro(String Nome) {
        super(
            Nome,
            Tipo.GUERREIRO,
            Tipo.GUERREIRO.getPVmaximo(),
            Tipo.GUERREIRO.getPMmaximo(),
            AtaquesFisicos.MACHADADA_BRUTAL,
            AtaquesMagicos.BLOCO_DE_ACUCAR,
            Cura.GUERREIRO
        );
    }
}
