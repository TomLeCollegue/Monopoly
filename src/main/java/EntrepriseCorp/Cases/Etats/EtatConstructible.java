package EntrepriseCorp.Cases.Etats;

public class EtatConstructible implements Etat {
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