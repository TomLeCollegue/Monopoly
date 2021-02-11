package EntrepriseCorp.Cases.Etats;

import EntrepriseCorp.Cases.Propriete;

public class EtatLibreService extends EtatLibre {
    public EtatLibreService(Propriete c) {
        super(c);
    }

    @Override
    public void achat() {
        c.setState(new EtatPossedeService(c));
    }

}