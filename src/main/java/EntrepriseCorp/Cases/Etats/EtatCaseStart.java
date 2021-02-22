package EntrepriseCorp.Cases.Etats;

import EntrepriseCorp.Cases.Propriete;
import EntrepriseCorp.Cases.Start;
import EntrepriseCorp.Joueur;

public class EtatCaseStart extends Etat{

    private Start start;

    public EtatCaseStart(Start start) {
        this.start = start;

    }

    @Override
    public void demanderConsigne(Joueur joueur) {
        joueur.donnerLaMain();
    }
}
