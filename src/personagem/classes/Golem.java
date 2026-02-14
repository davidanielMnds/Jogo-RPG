package personagem.classes;
import personagem.Pessoa;
import personagem.ataques.AtaquesFisicos;
import personagem.ataques.AtaquesMagicos;
import personagem.ataques.Cura;

public class Golem extends Pessoa{ 
    public Golem(String Nome) {
        super(
            Nome,
            Tipo.GOLEM,
            Tipo.GOLEM.getPVmaximo(),
            Tipo.GOLEM.getPMmaximo(),
            AtaquesFisicos.IMPACTO_ROCHOSO,
            AtaquesMagicos.NUCLEO_INSTAVEL,
            Cura.GOLEM
        );
    }
}