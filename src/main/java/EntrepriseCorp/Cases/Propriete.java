package EntrepriseCorp.Cases;

import EntrepriseCorp.Cases.Etats.Etat;
import EntrepriseCorp.Cases.Etats.EtatLibre;
import EntrepriseCorp.Cases.Etats.EtatLibreService;
import EntrepriseCorp.Joueur;

public abstract class Propriete extends Case {
    protected Etat state;
    protected Joueur proprietaire;
    protected int coutAchat;
    protected int loyer;

    public Propriete() {
        super();
    }

    public Propriete(int coutAchat, int loyer, String nom, Case caseSuivante) {
        super(nom, caseSuivante);
        this.coutAchat = coutAchat;
        this.loyer = loyer;
    }

    public void proposeAchat(int tarif) {
        return;
    }

    public boolean achat(Joueur j) {
        if(state instanceof EtatLibre && j.getSolde() >= coutAchat) {
            ((EtatLibre) state).achat();
            return true;
        }
        return false;
    }

    public Etat getState() {
        return state;
    }

    public void setState(Etat state) {
        this.state = state;
    }

    public int getCoutAchat() {
        return this.coutAchat;
    }

    public void setCoutAchat(int coutAchat) {
        this.coutAchat = coutAchat;
    }

    public int getLoyer() {
        return this.loyer;
    }

    public void setLoyer(int loyer) {
        this.loyer = loyer;
    }

    public String getNom() {
        return this.name;
    }

    public void setNom(String nom) {
        this.name = nom;
    }

    public Joueur getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(Joueur proprietaire) {
        this.proprietaire = proprietaire;
    }
}