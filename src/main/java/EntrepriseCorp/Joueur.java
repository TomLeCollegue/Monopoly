package EntrepriseCorp;

import EntrepriseCorp.Cases.Case;

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

        System.out.println("Le Joueur donne la main");
        partie.prochainJoueur();
    }

































}