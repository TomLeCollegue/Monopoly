package EntrepriseCorp;

import java.util.ArrayList;

public class Partie {

    private Plateau plateau;
    private ArrayList<Joueur> joueurs = new ArrayList<Joueur>();
    private Joueur joueurCourant;


    public Plateau getPlateau() {
        return this.plateau;
    }

    public void setPlateau(Plateau plateau) {
        this.plateau = plateau;
    }

    public ArrayList<Joueur> getJoueurs() {
        return this.joueurs;
    }

    public void setJoueurs(ArrayList<Joueur> joueurs) {
        this.joueurs = joueurs;
    }

    public Joueur getJoueurCourant() {
        return this.joueurCourant;
    }

    public void setJoueurCourant(Joueur joueurCourant) {
        this.joueurCourant = joueurCourant;
    }


    public Partie(Plateau plateau, ArrayList<Joueur> joueurs, Joueur joueurCourant) {
        this.plateau = plateau;
        this.joueurs = joueurs;
        this.joueurCourant = joueurCourant;
    }

    public Partie(){};
    

}