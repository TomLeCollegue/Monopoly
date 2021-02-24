package EntrepriseCorp.Cases.Etats;

import EntrepriseCorp.Cases.Propriete;
import EntrepriseCorp.Cases.Terrain;
import EntrepriseCorp.Joueur;

public class EtatTerrainPossede extends Etat {

    private Terrain propriete;

    public EtatTerrainPossede(Terrain propriete, Joueur joueur) {
        this.propriete = propriete;
        System.out.println("Etat Possedé de la case " + propriete.getNom());
        verifConstructible(joueur);

    }

    @Override
    public void demanderConsigne(Joueur joueur) {
        verifConstructible(joueur);
        if(joueur != propriete.getProprietaire()){
            demanderLoyer(joueur);
        }
        else{
            joueur.donnerLaMain();
        }
    }

    private void demanderLoyer(Joueur joueur) {
        int loyer = propriete.getLoyer();
        joueur.setSolde(joueur.getSolde() - loyer);
        propriete.getProprietaire().setSolde( propriete.getProprietaire().getSolde() + loyer);
        System.out.println( joueur.getNom() + " paye " + loyer + "€ de loyer a " + propriete.getProprietaire().getNom());
        joueur.donnerLaMain();
    }

    public void verifConstructible(Joueur joueur){
        if(propriete.getQuartier().estConstructible()){
            propriete.getState().demanderConsigne(joueur);
        }
    }

}
