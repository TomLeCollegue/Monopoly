package EntrepriseCorp;

import EntrepriseCorp.Cases.Etats.EtatPropriete;

public abstract class Terrain extends Propriete {
    private EtatPropriete state = new EtatLibre();

    public Terrain() {
        super();
    }

    public Terrain(int coutAchat, int loyer, String nom) {
        super(coutAchat, loyer, nom); 
    }
}