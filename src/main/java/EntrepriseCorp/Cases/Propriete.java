package EntrepriseCorp.Cases;

import EntrepriseCorp.Cases.Etats.Etat;

import EntrepriseCorp.Joueur;

public abstract class Propriete extends Case {
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

    public int getCoutAchat() {
        return this.coutAchat;
    }

    public void setCoutAchat(int coutAchat) {
        this.coutAchat = coutAchat;
    }

    public int getLoyer() {
        return this.loyer;
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