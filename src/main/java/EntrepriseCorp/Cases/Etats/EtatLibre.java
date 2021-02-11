package EntrepriseCorp.Cases.Etats;

public interface EtatLibre {
    public int demandeConsigneLibre();
    public int proposeAchat(int tarif);
    public boolean achat();
}