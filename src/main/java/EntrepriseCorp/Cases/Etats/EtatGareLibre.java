package EntrepriseCorp.Cases.Etats;

import EntrepriseCorp.Cases.Propriete;
import EntrepriseCorp.Joueur;

import java.util.Scanner;

public class EtatGareLibre extends Etat {

    private Propriete propriete;


    public EtatGareLibre(Propriete propriete) {
        this.propriete = propriete;
    }

    @Override
    public void demanderConsigne(Joueur joueur) {
        proposerAchat(joueur);
    }


    public void proposerAchat(Joueur joueur){
        System.out.println("Voulez vous acheter le terrain (y/n)");
        Scanner in = new Scanner(System.in);
        String selection = in.nextLine();
        if(selection.equals("y")){
            Acheter(joueur);
        }
        else{
            // On donne la main
            joueur.donnerLaMain();
        }

    }

    private void Acheter(Joueur joueur) {
        int prix = propriete.getCoutAchat();

        if((joueur.getSolde() - prix) >= 0 ){
            joueur.setSolde(joueur.getSolde() - prix);
            DevientEtatPossede(joueur);
        }
        else{
            System.out.println("vous etes trop pauvre");
            joueur.donnerLaMain();
        }
    }

    private void DevientEtatPossede(Joueur joueur) {
        propriete.setProprietaire(joueur);
        propriete.setState(new EtatGarePossede(propriete));
        joueur.donnerLaMain();
    }

    public void verifConstructible(){
    }

}
