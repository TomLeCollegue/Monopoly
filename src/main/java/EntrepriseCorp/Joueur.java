package EntrepriseCorp;

public class Joueur {
    private String nom;
    private int solde;


    public Joueur(String nom) {
        this.nom = nom;
        this.solde = 1500; // Solde de depart d'apres les règles du jeu
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getSolde() {
        return this.solde;
    }

    public void setSolde(int solde) {
        this.solde = solde;
    }

































}