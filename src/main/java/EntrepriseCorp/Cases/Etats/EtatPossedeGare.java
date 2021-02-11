package EntrepriseCorp.Cases.Etats;

public class EtatPossedeGare extends Etat implements EtatPropriete {
    @Override
    public int demandeLoyer() {
        return 0;
    }

    @Override
    public int demandeLanceDes() {
        return 0;
    }

    @Override
    public int calculLoyer() {
        return 0;
    }

    @Override
    public int proposeAchat(int tarif) {
        return 0;
    }

    @Override
    public boolean achat() {
        return false;
    }

    @Override
    public void demandeConsigne() {
        return;
    }
}