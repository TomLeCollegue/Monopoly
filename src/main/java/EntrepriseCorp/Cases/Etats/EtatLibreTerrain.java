package EntrepriseCorp.Cases.Etats;

import EntrepriseCorp.Cases.Propriete;

public class EtatLibreTerrain extends EtatLibre {
    public EtatLibreTerrain(Propriete c) {
        super(c);
    }

    @Override
    public void achat() {
        c.setState(new EtatPossedeTerrain(c));
    }
}