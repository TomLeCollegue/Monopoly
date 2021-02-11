package EntrepriseCorp.Cases.Etats;

import EntrepriseCorp.Cases.Propriete;

public class EtatPossedeGare extends EtatPossede{
    public EtatPossedeGare(Propriete c) {
        super(c);
    }

    @Override
    public int calculLoyer() {
        return c.getLoyer();
    }
}