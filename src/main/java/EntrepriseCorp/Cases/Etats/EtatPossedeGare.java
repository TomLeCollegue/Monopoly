package EntrepriseCorp.Cases.Etats;

public class EtatPossedeGare implements Etat, EtatPropriete {
    public EtatPossedeGare(int tarif) {
        super(tarif);
    }

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
    public boolean achat() {
        return
    }

    @Override
    public void demandeConsigne() {
        return;
    }
}