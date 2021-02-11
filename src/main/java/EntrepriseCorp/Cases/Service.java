package EntrepriseCorp.Cases;

import EntrepriseCorp.Cases.Etats.EtatLibreService;

import java.util.ArrayList;

public class Service extends Propriete {
    public ArrayList<Service> AutresServices = new ArrayList<Service>();

    public Service(int coutAchat, int loyer, String nom, Case caseSuivante) {
        super(coutAchat, loyer, nom, caseSuivante);
        state = new EtatLibreService(this);
    }

    public int lancerDesJoueur() {
        return proprietaire.lancerDes();
    }

}