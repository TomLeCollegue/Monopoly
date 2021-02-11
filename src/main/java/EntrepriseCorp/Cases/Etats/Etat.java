package EntrepriseCorp.Cases.Etats;

import EntrepriseCorp.Cases.Case;

public abstract class Etat {
    protected Case c;

    protected Etat(Case c) {
        this.c = c;
    }

    protected abstract void demandeConsigne();
    protected abstract boolean achat();
}
