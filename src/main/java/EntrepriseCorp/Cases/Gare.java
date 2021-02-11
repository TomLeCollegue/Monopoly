package EntrepriseCorp.Cases;

import java.util.ArrayList;

public class Gare extends Propriete {

    public ArrayList<Gare> AutresGares = new ArrayList<Gare>();

    public Gare(int loyer, String nom, int coutAchat, Case caseSuivante) {
        super(coutAchat, loyer, nom, caseSuivante);
    }




}