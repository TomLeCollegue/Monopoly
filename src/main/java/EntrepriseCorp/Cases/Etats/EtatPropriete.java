package EntrepriseCorp;

public interface EtatPropriete {
    public int demandeConsigne();
    public int demandeLoyer();
    public int demandeLanceDes();
    public int calculLoyer();
    public int proposeAchat(int tarif);
    public boolean achat();
}