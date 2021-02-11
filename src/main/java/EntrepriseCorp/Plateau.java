package EntrepriseCorp;

import java.util.ArrayList;

import EntrepriseCorp.Cases.*;

public class Plateau {

    public ArrayList<Case> cases = new ArrayList<Case>();
    private ArrayList<Quartier> quartiers = new ArrayList<Quartier>();

    public Plateau() {
        cases = createCase();
    }

    private ArrayList<Case> createCase(){
        ArrayList<Case> cases = new ArrayList<Case>();
        Case start = new Start("Start");
        cases.add(start);
        Case rueDeLaPaix = new Terrain(400,50,"Rue de la paix",start);
        cases.add(rueDeLaPaix);
        Case AvenueEly = new Terrain(350,35,"Avenue des champs Elysées",rueDeLaPaix);
        cases.add(AvenueEly);
        Case GareSTLazare = new Gare(25, "Gare St Lazare", 200, AvenueEly);
        cases.add(GareSTLazare);
        Case Capucine = new Terrain(320,28,"Boulevard des Capucine",GareSTLazare);
        cases.add(Capucine);
        Case Foch = new Terrain(300,26,"Avenue Foch",Capucine);
        cases.add(Foch);
        Case Breteuil = new Terrain(300,26,"Avenue de Breteuil",Foch);
        cases.add(Breteuil);
        Case Fayette = new Terrain(280,24,"Rue la Fayette",Breteuil);
        cases.add(Fayette);
        Case compagnieDesEaux = new Service(100,50,"Compagnie des eaux",Fayette);
        cases.add(compagnieDesEaux);
        Case PlaceBourse = new Terrain(260,22,"Place de la Bourse",compagnieDesEaux);
        cases.add(PlaceBourse);
        Case StHonore = new Terrain(260,22,"Faubourg st honoré",PlaceBourse);
        cases.add(StHonore);
        Case GareNord = new Gare(25, "Gare du nord", 200, StHonore);
        cases.add(GareNord);
        Case HenriMartin = new Terrain(240,20,"Avenue henri-Martin",GareSTLazare);
        cases.add(HenriMartin);
        Case MalesHerbes = new Terrain(220,18,"Boulevard MalesHerbes",HenriMartin);
        cases.add(MalesHerbes);
        Case Matignon = new Terrain(220,18,"Avenue Matignon",MalesHerbes);
        cases.add(Matignon);
        Case Pigalle = new Terrain(200,16,"Place Pigalle",Matignon);
        cases.add(Pigalle);
        Case stMichel = new Terrain(180,14,"Blvd St Michel",Pigalle);
        cases.add(stMichel);
        Case mozart = new Terrain(180,14,"Avenue Mozart",stMichel);
        cases.add(mozart);
        Case GareLyon = new Gare(25, "Gare de Lyon", 200, mozart);
        cases.add(GareLyon);
        Case paradis = new Terrain(160,12,"rue de Paradis",GareLyon);
        cases.add(paradis);
        Case neuilly = new Terrain(140,10,"Avenue de Neuilly",paradis);
        cases.add(neuilly);
        Case elec = new Service(150,50,"Compagnie electricité",neuilly);
        cases.add(elec);
        Case vilette = new Terrain(140,10,"Boulevard de la Vilette",elec);
        cases.add(vilette);
        Case republique = new Terrain(120,8,"Avenue de Republique",vilette);
        cases.add(republique);
        Case courcelle = new Terrain(100,6,"Rue de courcelles",republique);
        cases.add(courcelle);
        Case Vaugirard = new Terrain(100,6,"Rue de Vaugirard",courcelle);
        cases.add(Vaugirard);
        Case GareMonparnasse = new Gare(25, "Gare Montparnasse", 200, mozart);
        cases.add(GareMonparnasse);
        Case lecourbe = new Terrain(60,4,"Rue Lecourbe",GareMonparnasse);
        cases.add(lecourbe);
        Case belleville = new Terrain(60,4,"Boulevard de Belleville",lecourbe);
        cases.add(belleville);
        start.setCaseSuivante(belleville);

        return cases;
    }
    
    public Case getPositionJoueur(int resultDes, Case caseDepart){
        for (int i = 0; i < resultDes; i++) {
            caseDepart = caseDepart.getCaseSuivante();
        }

        return caseDepart;
    }
    

}