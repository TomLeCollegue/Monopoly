package EntrepriseCorp.Cases.Etats;

import EntrepriseCorp.Cases.Propriete;

public class EtatPossedeTerrain extends EtatPossede {
    public EtatPossedeTerrain(Propriete c) {
        super(c);
    }

    @Override
    public int calculLoyer() {
        return c.getLoyer();
    }
}