package personagem.classes;
import personagem.Pessoa;
import personagem.ataques.AtaquesFisicos;
import personagem.ataques.AtaquesMagicos;
import personagem.ataques.Cura;

public class Vampiro extends Pessoa{
    public Vampiro(String Nome) {
        super(
            Nome,
            Tipo.VAMPIRO,
            Tipo.VAMPIRO.getPVmaximo(),
            Tipo.VAMPIRO.getPMmaximo(),
            AtaquesFisicos.DILACERAR,
            AtaquesMagicos.PACTO_CARMESIM,
            Cura.ESQUELETO
        );
    }
}
