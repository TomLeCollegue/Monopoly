package EntrepriseCorp;

import java.util.ArrayList;

import EntrepriseCorp.Cases.Propriete;

public class Quartier {

    public ArrayList<Propriete> proprietes = new ArrayList<Propriete>();

    public boolean estConstructible(){
        boolean result = true;
        Joueur proprio;

        if(proprietes.get(0).getProprietaire() !=null){
            proprio = proprietes.get(0).getProprietaire();
            for (int i = 0; i < proprietes.size(); i++) {
                if(proprietes.get(i).getProprietaire() != proprio){
                    result = false;
                }
            }
        }
        else{
            result = false;
        }
        return result;
    }
}