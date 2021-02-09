public class Gare extends Propriete {

    public ArrayList<Gare> AutresGares = new ArrayList<Gare>();

    public Gare(ArrayList<Gare> AutresGares, int loyer, String nom, int coutAchat) {
        super(coutAchat, loyer, nom);
        this.AutresGares = AutresGares;
    }




}