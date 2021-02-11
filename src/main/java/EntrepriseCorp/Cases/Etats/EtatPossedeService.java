package EntrepriseCorp.Cases.Etats;

public class EtatPossedeService implements Etat, EtatPropriete {
    public EtatPossedeService(int tarif) {
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
        return false;
    }

    @Override
    public void demandeConsigne() {
        return;
    }
}