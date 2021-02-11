package EntrepriseCorp.Cases.Etats;

import EntrepriseCorp.Cases.Propriete;

public class EtatConstructible extends EtatPossede {
    public EtatConstructible(Propriete c) {
        super(c);
    }

    public int proposeAchat() {
        return 0;
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
    public int demandeConsigne() {
        return 0;
    }
}