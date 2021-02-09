package EntrepriseCorp;

public abstract class Propriete extends Case {
    private int coutAchat;
    private int loyer;

    public Propriete() {
        super();
    }

    public Propriete(int coutAchat, int loyer, String nom) {
        super(nom);
        this.coutAchat = coutAchat;
        this.loyer = loyer;
    }

    public int getCoutAchat() {
        return this.coutAchat;
    }

    public void setCoutAchat(int coutAchat) {
        this.coutAchat = coutAchat;
    }

    public int getLoyer() {
        return this.loyer;
    }

    public void setLoyer(int loyer) {
        this.loyer = loyer;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "{" +
            " coutAchat='" + getCoutAchat() + "'" +
            ", loyer='" + getLoyer() + "'" +
            ", nom='" + getNom() + "'" +
            "}";
    }
}