package EntrepriseCorp.Cases.Etats;

import EntrepriseCorp.Cases.Propriete;

public class EtatPossedeService extends EtatPossede {
    public EtatPossedeService(Propriete c) {
        super(c);
    }

    @Override
    public int calculLoyer() {
        return c.getLoyer() * demandeLanceDes();
    }
}