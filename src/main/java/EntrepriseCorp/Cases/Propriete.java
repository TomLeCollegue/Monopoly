package EntrepriseCorp.Cases;
public abstract class Propriete extends Case {
    private int coutAchat;
    private int loyer;

    public Propriete() {
        super();
    }

    public Propriete(int coutAchat, int loyer, String nom, Case caseSuivante) {
        super(nom, caseSuivante);
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
        return this.name;
    }

    public void setNom(String nom) {
        this.name = nom;
    }

    
}