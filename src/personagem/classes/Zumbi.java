package personagem.classes;
import personagem.Pessoa;
import personagem.ataques.AtaquesFisicos;
import personagem.ataques.AtaquesMagicos;
import personagem.ataques.Cura;

public class Zumbi extends Pessoa{

    public Zumbi(String Nome) {
        super(
            Nome,
            Tipo.ZUMBI,
            Tipo.ZUMBI.getPVmaximo(),
            Tipo.ZUMBI.getPMmaximo(),
            AtaquesFisicos.MORDIDA_INFECTADA,
            AtaquesMagicos.MIASMA_PUTRIDO,
            Cura.GOLEM
        );
    }    
}

