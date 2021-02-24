package EntrepriseCorp;

import java.util.ArrayList;

import EntrepriseCorp.Cases.Etats.EtatTerrainConstructible;
import EntrepriseCorp.Cases.Propriete;
import EntrepriseCorp.Cases.Terrain;

public class Quartier {

    public ArrayList<Terrain> proprietes = new ArrayList<Terrain>();
    public boolean constructible = false;

    public boolean estConstructible(){
        boolean result = true;
        Joueur proprio;

        if(proprietes.get(0).getProprietaire() !=null){
            proprio = proprietes.get(0).getProprietaire();
            for (Terrain propriete : proprietes) {
                if(propriete.getProprietaire() != proprio){
                    result = false;
                }
            }
        }
        else{
            result = false;
        }

        if (result == true){
            constructible = true;
            for (Terrain propriete : proprietes) {
                propriete.setState(new EtatTerrainConstructible(propriete));
            }
        }
        return result;
    }
}