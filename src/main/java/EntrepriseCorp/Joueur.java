package EntrepriseCorp;

import EntrepriseCorp.Cases.Case;
import EntrepriseCorp.Cases.Etats.EtatTerrainConstructible;
import EntrepriseCorp.Cases.Terrain;

import java.util.ArrayList;
import java.util.Scanner;

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

    public int getSolde() {
        return this.solde;
    }

    public void setSolde(int solde) {
        this.solde = solde;
    }


    // lance les des et retoune un resultat entre 2 et 12
    public int lancerDes(){

        int result;

        if(Partie.Cheat){
            Scanner in = new Scanner(System.in);
            result = in.nextInt();
            System.out.println(nom + " lance les dés sans tricher et fait " + result);
        }
        else{
            result = (int) ((Math.random() * ((12 - 2) + 1)) + 2);
            System.out.println(nom + " lance les dés et fait " + result);
        }
        return result;
    }

    public int LancerDesCheat(){
        Scanner in = new Scanner(System.in);
        int result = in.nextInt();
        System.out.println(nom + " lance les dés sans tricher et fait " + result);
        return result;
    }


    public void jouerUnTour(){
        int resultDes = lancerDes();
        caseCourante = partie.getPlateau().getPositionJoueur(resultDes, caseCourante, this);
        System.out.println( nom + " est atteri sur " + caseCourante.getName());
        caseCourante.getState().demanderConsigne(this);
        
    }
    
    public void donnerLaMain(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Voulez vous contruire sur une propriété (y/n)");
        String choix = scanner.next();
        if(choix.equals("y")){
            System.out.println("Choisissez la propriété :");
            ArrayList<Terrain> terrains = partie.getPlateau().getTerrainConstructible(this);
            if(terrains.size() != 0){
                for (int i = 0; i < terrains.size(); i++) {
                    System.out.println( i + " : " +  terrains.get(i).getNom());
                }
                int choixTerrain = scanner.nextInt();
                EtatTerrainConstructible etat = (EtatTerrainConstructible) terrains.get(choixTerrain).getState();
                etat.Construire(this);
            }
            else{
                System.out.println("Vous n'avez pas de Terrain constructible ! Désolé");
            }
        }

        System.out.println("Le Joueur donne la main");
        partie.prochainJoueur();
    }

}