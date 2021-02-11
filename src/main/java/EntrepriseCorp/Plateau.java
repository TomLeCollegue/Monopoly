package EntrepriseCorp;

import java.util.ArrayList;

import EntrepriseCorp.Cases.*;

public class Plateau {

    public ArrayList<Case> cases = new ArrayList<Case>();
    private ArrayList<Quartier> quartiers = new ArrayList<Quartier>();

    public Plateau() {

    }




    private ArrayList<Case> createCase(){
        ArrayList<Case> cases = new ArrayList<Case>();
        Case start = new Start("Start");
        cases.add(start);
        Case rueDeLaPaix = new Terrain(400,50,"Rue de la paix",start);
        cases.add(rueDeLaPaix);
        Case taxeLuxe = new Service(400,50,"Taxe de luxe",rueDeLaPaix);
        cases.add(taxeLuxe);
        Case AvenueEly = new Terrain(350,35,"Avenue des champs Elysées",taxeLuxe);
        Case

        return cases;
    }
    

}