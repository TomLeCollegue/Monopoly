package EntrepriseCorp.Cases.Etats;

import EntrepriseCorp.Cases.Propriete;

public abstract class Etat {
    protected Propriete c;

    protected Etat(Propriete c) {
        this.c = c;
    }

    public abstract int demandeConsigne();
}
