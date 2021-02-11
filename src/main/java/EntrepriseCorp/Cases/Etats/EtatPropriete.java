package EntrepriseCorp.Cases.Etats;

public interface EtatPropriete {
    public int demandeLoyer();
    public int demandeLanceDes();
    public int calculLoyer();
    public int proposeAchat(int tarif);
    public boolean achat();
}