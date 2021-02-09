public class Service extends Propriete {


    public ArrayList<Service> AutresServices = new ArrayList<Service>();

    public Gare(ArrayList<Service> AutresServices, int loyer, String nom, int coutAchat) {
        super(coutAchat, loyer, nom);
        this.AutresServices = AutresServices;
    }

}