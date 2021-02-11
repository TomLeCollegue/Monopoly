package EntrepriseCorp.Cases.Etats;

public class EtatLibre implements Etat {
    public int proposeAchat(int tarif) {
        return 0;
    }

    @Override
    public boolean achat() {
        return true;
    }

    @Override
    public void demandeConsigne() {
        return;
    }
}