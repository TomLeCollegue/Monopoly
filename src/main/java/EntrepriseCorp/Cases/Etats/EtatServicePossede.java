package EntrepriseCorp.Cases.Etats;

import EntrepriseCorp.Cases.Propriete;
import EntrepriseCorp.Joueur;

public class EtatServicePossede extends Etat {
    private Propriete propriete;

    public EtatServicePossede(Propriete propriete) {
        this.propriete = propriete;
    }

    @Override
    public void demanderConsigne(Joueur joueur) {
        if(joueur != propriete.getProprietaire()){
            demanderLoyer(joueur);
        }
        else{
            joueur.donnerLaMain();
        }
    }

    private void demanderLoyer(Joueur joueur) {
        int loyer = CalculLoyer(joueur);
        joueur.setSolde(joueur.getSolde() - loyer);
        propriete.getProprietaire().setSolde( propriete.getProprietaire().getSolde() + loyer);
        System.out.println( joueur.getNom() + " paye " + loyer + "€ de loyer a " + propriete.getProprietaire().getNom());
        joueur.donnerLaMain();
    }

    private int CalculLoyer(Joueur joueur){
        int resultDe = joueur.lancerDes();
        return propriete.getLoyer() * resultDe;
    }
}
