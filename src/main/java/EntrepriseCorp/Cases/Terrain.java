package EntrepriseCorp.Cases;

import EntrepriseCorp.Cases.Etats.Etat;
import EntrepriseCorp.Cases.Etats.EtatLibreTerrain;

public class Terrain extends Propriete {
    public Terrain() {
        super();
    }

    public Terrain(int coutAchat, int loyer, String nom, Case caseSuivante) {
        super(coutAchat, loyer, nom, caseSuivante);
        state = new EtatLibreTerrain(this);
    }
}