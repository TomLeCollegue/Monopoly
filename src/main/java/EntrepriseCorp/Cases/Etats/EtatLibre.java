package EntrepriseCorp.Cases.Etats;

import EntrepriseCorp.Cases.Propriete;

public abstract class EtatLibre extends Etat {
    protected EtatLibre(Propriete c) {
        super(c);
    }

    public abstract void achat();
    public int proposeAchat() {
        return c.getCoutAchat();
    }

    @Override
    public int demandeConsigne() {
        return proposeAchat();
    }

}
