package EntrepriseCorp.Cases.Etats;

import EntrepriseCorp.Cases.Propriete;
import EntrepriseCorp.Cases.Terrain;

public class EtatLibreGare extends EtatLibre {
    public EtatLibreGare(Propriete c) {
        super(c);
    }

    @Override
    public void achat() {
        c.setState(new EtatPossedeGare(c));
    }
}