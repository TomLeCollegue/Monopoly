package EntrepriseCorp.Cases;


import EntrepriseCorp.Cases.Etats.EtatTerrainLibre;
import EntrepriseCorp.Quartier;

public class Terrain extends Propriete {

    private Quartier quartier;
    private int EtatConstruction = 0;
    public Terrain(int coutAchat, int loyer, String nom, Case caseSuivante, Quartier quartier) {
        super(coutAchat, loyer, nom, caseSuivante);
        etat = (new EtatTerrainLibre(this));
        this.quartier = quartier;
    }

    public Quartier getQuartier() {
        return quartier;
    }

    public int getEtatConstruction() {
        return EtatConstruction;
    }

    public void setEtatConstruction(int etatConstruction) {
        EtatConstruction = etatConstruction;
    }
}