package EntrepriseCorp.Cases;

import EntrepriseCorp.Cases.Etats.Etat;
import EntrepriseCorp.Cases.Etats.EtatLibre;

public class Terrain extends Propriete {
    private Etat state = new EtatLibre();

    public Terrain() {
        super();
    }

    public Terrain(int coutAchat, int loyer, String nom, Case caseSuivante) {
        super(coutAchat, loyer, nom, caseSuivante);
    }
}