package EntrepriseCorp.Cases.Etats;

import EntrepriseCorp.Cases.Case;

public class EtatConstructible extends Etat implements EtatPropriete {
    public EtatConstructible(Case c) {
        super(tarif);
    }

    public int proposeAchat() {
        return tarif;
    }

    @Override
    public boolean achat() {
        return true;
    }

    @Override
    public int demandeLoyer() {
        return 0;
    }

    @Override
    public int demandeLanceDes() {
        return -1;
    }

    @Override
    public int calculLoyer() {
        return 0;
    }

    @Override
    public void demandeConsigne() {
        return;
    }
}