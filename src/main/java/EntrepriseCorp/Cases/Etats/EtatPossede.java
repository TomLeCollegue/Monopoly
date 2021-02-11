package EntrepriseCorp.Cases.Etats;

import EntrepriseCorp.Cases.Propriete;

public abstract class EtatPossede extends Etat {

    protected EtatPossede(Propriete c) {
        super(c);
    }

    public abstract int calculLoyer();

    public int demandeLoyer() {
        return calculLoyer();
    }

    public int demandeLanceDes() {
        return c.getProprietaire().lancerDes();
    }

    @Override
    public int demandeConsigne() {
        return demandeLoyer();
    }
}
