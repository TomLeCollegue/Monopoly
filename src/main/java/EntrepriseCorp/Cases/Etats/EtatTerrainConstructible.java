package EntrepriseCorp.Cases.Etats;

import EntrepriseCorp.Cases.Etats.Etat;
import EntrepriseCorp.Cases.Propriete;
import EntrepriseCorp.Cases.Terrain;
import EntrepriseCorp.Joueur;

import java.util.Scanner;

public class EtatTerrainConstructible extends Etat {

    private Terrain propriete;

    public EtatTerrainConstructible(Terrain propriete) {
        System.out.println("Etat Constructible de la case " + propriete.getNom());
       this.propriete = propriete;
    }

    @Override
    public void demanderConsigne(Joueur joueur) {
        if(joueur != propriete.getProprietaire()){
            demanderLoyer(joueur);
        }
        else if(propriete.getEtatConstruction() < 5) {
            proposerConstruction(joueur);
            joueur.donnerLaMain();
        }
        else{
            joueur.donnerLaMain();
        }
    }

    public void proposerConstruction(Joueur joueur){
        System.out.println("Voulez vous construire sur le terrain pour 100 € (y/n)");
        Scanner in = new Scanner(System.in);
        String selection = in.nextLine();
        if(selection.equals("y")){
            Construire(joueur);
        }
    }

    public void Construire(Joueur joueur) {
        if(propriete.getEtatConstruction() < 5){
            if((joueur.getSolde() - 100) >= 0 ){
                joueur.setSolde(joueur.getSolde() - 100);
                System.out.println(joueur.getNom() + " construit sur " + propriete.getNom() + ". (-100)");
                propriete.setEtatConstruction( propriete.getEtatConstruction() + 1 );
            }
            else{
                System.out.println("vous etes trop pauvre");
            }
        }
        else{
            System.out.println("Terrain complet vous ne pouvez plus construire dessus");
        }


    }

    private void demanderLoyer(Joueur joueur) {
        int loyer = propriete.getLoyer() + propriete.getEtatConstruction() * 200;
        joueur.setSolde(joueur.getSolde() - loyer);
        propriete.getProprietaire().setSolde( propriete.getProprietaire().getSolde() + loyer);
        System.out.println( joueur.getNom() + " paye " + loyer + "€ de loyer a " + propriete.getProprietaire().getNom() + " car il y a " + propriete.getEtatConstruction() + " construction");
        joueur.donnerLaMain();
    }

}
