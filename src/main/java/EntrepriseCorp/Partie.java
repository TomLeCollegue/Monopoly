package EntrepriseCorp;

import java.util.ArrayList;

public class Partie {
    public static boolean Cheat = false;
    private Plateau plateau = new Plateau();
    private ArrayList<Joueur> joueurs = new ArrayList<Joueur>();
    private int indexJoeurCourant = 0;


    public Plateau getPlateau() {
        return this.plateau;
    }

    public ArrayList<Joueur> getJoueurs() {
        return this.joueurs;
    }

    public Partie(){};


    public void createJoueur(String nom){
        Joueur Newjoueur = new Joueur(nom, plateau.cases.get(0), this);
        joueurs.add(Newjoueur);
    }



    // Gestion debut de tour ----------------------------------------------------------------
    public void donnerLaMain(){
        System.out.println("-----------------------------------------------------------------");
        System.out.println("C'est a "+ joueurs.get(indexJoeurCourant).getNom() + " de jouer");
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