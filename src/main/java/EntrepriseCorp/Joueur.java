package EntrepriseCorp;

import EntrepriseCorp.Cases.Case;

public class Joueur {
    private String nom;
    private int solde;
    private Case caseCourante;
    private Partie partie;


    public Joueur(String nom, Case caseCourante, Partie partie) {
        this.nom = nom;
        this.solde = 1500; // Solde de depart d'apres les règles du jeu
        this.caseCourante = caseCourante;
        this.partie = partie;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getSolde() {
        return this.solde;
    }

    public void setSolde(int solde) {
        this.solde = solde;
    }


    // lance les des et retoune un resultat entre 2 et 12
    public int lancerDes(){
        int result = (int) ((Math.random() * ((12 - 2) + 1)) + 2);
        return result;
    }


    public void jouerUnTour(){
        int resultDes = lancerDes();
        caseCourante = partie.getPlateau().getPositionJoueur(resultDes, caseCourante);

        // Demande consigne a la case avec lui meme en param
        
    }
    
    public void donnerLaMain(){
        partie.prochainJoueur();
    }

































}