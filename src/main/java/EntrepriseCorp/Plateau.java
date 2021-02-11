package EntrepriseCorp;

import java.util.ArrayList;

import EntrepriseCorp.Cases.Gare;

public class Plateau {

    public ArrayList<Gare> AutresGares = new ArrayList<Gare>();

    public Gare(ArrayList<Gare> AutresGares, int loyer, String nom, int coutAchat) {
        super(coutAchat, loyer, nom);
        this.AutresGares = AutresGares;
    }
    private ArrayList<Quartier> quartiers = new ArrayList<Quartier>();
    

}