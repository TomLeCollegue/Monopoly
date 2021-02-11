package EntrepriseCorp.Cases.Etats;

public class EtatLibreGare implements Etat {
    public EtatLibreGare(int tarif) {
        super(tarif);
    }

    public int proposeAchat() {
        return tarif;
    }

    @Override
    public Etat achat(int solde) {

    }

    @Override
    public void demandeConsigne() {
        return;
    }

    @Override
    public Etat miseAJourEtat() {
        return new EtatPossedeGare();
    }
}