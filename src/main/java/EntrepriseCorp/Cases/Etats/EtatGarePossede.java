package EntrepriseCorp.Cases.Etats;

import EntrepriseCorp.Cases.Gare;
import EntrepriseCorp.Cases.Propriete;
import EntrepriseCorp.Joueur;

public class EtatGarePossede extends Etat {

    private Propriete propriete;

    public EtatGarePossede(Propriete propriete) {
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
        int loyer = CalculLoyer();
        joueur.setSolde(joueur.getSolde() - loyer);
        propriete.getProprietaire().setSolde( propriete.getProprietaire().getSolde() + loyer);
        System.out.println( joueur.getNom() + " paye " + loyer + "€ de loyer a " + propriete.getProprietaire().getNom());
        joueur.donnerLaMain();
    }

    private int CalculLoyer(){
        int loyer = 0;
        Gare gare = (Gare) propriete;
        for (int i = 0; i < gare.Gares.size(); i++) {
            if(gare.Gares.get(i).getProprietaire() == gare.getProprietaire()){
                loyer+=25;
            }
        }

        return loyer;
    }

}
