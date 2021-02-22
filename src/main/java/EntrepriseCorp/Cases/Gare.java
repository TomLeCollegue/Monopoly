package EntrepriseCorp.Cases;


import EntrepriseCorp.Cases.Etats.EtatGareLibre;

import java.util.ArrayList;

public class Gare extends Propriete {
    public ArrayList<Gare> Gares = new ArrayList<Gare>();

    public Gare(int loyer, String nom, int coutAchat, Case caseSuivante) {
        super(coutAchat, loyer, nom, caseSuivante);
        etat = new EtatGareLibre(this);
    }







}