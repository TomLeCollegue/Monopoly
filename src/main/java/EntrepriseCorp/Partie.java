package EntrepriseCorp;

import java.util.ArrayList;

public class Partie {

    private Plateau plateau;
    private ArrayList<Joueur> joueurs = new ArrayList<Joueur>();
    private int indexJoeurCourant;


    public Plateau getPlateau() {
        return this.plateau;
    }

    public void setPlateau(Plateau plateau) {
        this.plateau = plateau;
    }

    public ArrayList<Joueur> getJoueurs() {
        return this.joueurs;
    }

    public Partie(){};


    public void createJoueur(String nom){
        Joueur joueur = new Joueur(nom, plateau.cases.get(0), this);
    }



    // Gestion debut de tour ----------------------------------------------------------------
    public void donnerLaMain(){
        joueurs.get(indexJoeurCourant).jouerUnTour();
    }


    public void prochainJoueur() {
        if(indexJoeurCourant != joueurs.size()-1){
            indexJoeurCourant++;
        }
        else {
            indexJoeurCourant = 0;
        }
        donnerLaMain();
    }

    // --------------------------------------------------------------------------------------
}