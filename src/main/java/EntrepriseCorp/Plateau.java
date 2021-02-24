package EntrepriseCorp;

import java.util.ArrayList;

import EntrepriseCorp.Cases.*;

public class Plateau {

    public ArrayList<Case> cases = new ArrayList<Case>();
    private ArrayList<Quartier> quartiers = new ArrayList<Quartier>();
    public ArrayList<Gare> Gares = new ArrayList<Gare>();

    public Plateau() {
        cases = createCase();
    }

    private ArrayList<Case> createCase(){

        Quartier bleu = new Quartier();
        quartiers.add(bleu);
        Quartier vert = new Quartier();
        quartiers.add(vert);
        Quartier jaune = new Quartier();
        quartiers.add(jaune);
        Quartier rouge = new Quartier();
        quartiers.add(rouge);
        Quartier orange = new Quartier();
        quartiers.add(orange);
        Quartier rose = new Quartier();
        quartiers.add(rose);
        Quartier gris = new Quartier();
        quartiers.add(gris);
        Quartier marron = new Quartier();
        quartiers.add(marron);



        ArrayList<Case> cases = new ArrayList<Case>();
        Case start = new Start("Start");
        cases.add(start);
        Case rueDeLaPaix = new Terrain(400,50,"Rue de la paix",start, bleu);
        cases.add(rueDeLaPaix);
        bleu.proprietes.add((Terrain) rueDeLaPaix);
        Case AvenueEly = new Terrain(350,35,"Avenue des champs Elysées",rueDeLaPaix, bleu);
        cases.add(AvenueEly);
        bleu.proprietes.add((Terrain) AvenueEly);
        Case GareSTLazare = new Gare(25, "Gare St Lazare", 200, AvenueEly);
        Gares.add((Gare) GareSTLazare);
        cases.add(GareSTLazare);
        Case Capucine = new Terrain(320,28,"Boulevard des Capucine",GareSTLazare, vert);
        cases.add(Capucine);
        vert.proprietes.add((Terrain) Capucine);
        Case Foch = new Terrain(300,26,"Avenue Foch",Capucine, vert);
        cases.add(Foch);
        vert.proprietes.add((Terrain) Foch);
        Case Breteuil = new Terrain(300,26,"Avenue de Breteuil",Foch, vert);
        cases.add(Breteuil);
        vert.proprietes.add((Terrain) Breteuil);
        Case Fayette = new Terrain(280,24,"Rue la Fayette",Breteuil, jaune);
        cases.add(Fayette);
        jaune.proprietes.add((Terrain) Fayette);
        Case compagnieDesEaux = new Service(100,10,"Compagnie des eaux",Fayette);
        cases.add(compagnieDesEaux);
        Case PlaceBourse = new Terrain(260,22,"Place de la Bourse",compagnieDesEaux, jaune);
        cases.add(PlaceBourse);
        jaune.proprietes.add((Terrain) PlaceBourse);
        Case StHonore = new Terrain(260,22,"Faubourg st honoré",PlaceBourse, jaune);
        cases.add(StHonore);
        jaune.proprietes.add((Terrain) StHonore);
        Case GareNord = new Gare(25, "Gare du nord", 200, StHonore);
        Gares.add((Gare) GareNord);
        cases.add(GareNord);
        Case HenriMartin = new Terrain(240,20,"Avenue henri-Martin",GareNord, rouge);
        cases.add(HenriMartin);
        rouge.proprietes.add((Terrain) HenriMartin);
        Case MalesHerbes = new Terrain(220,18,"Boulevard MalesHerbes",HenriMartin, rouge);
        cases.add(MalesHerbes);
        rouge.proprietes.add((Terrain) MalesHerbes);
        Case Matignon = new Terrain(220,18,"Avenue Matignon",MalesHerbes, rouge);
        cases.add(Matignon);
        rouge.proprietes.add((Terrain) Matignon);
        Case Pigalle = new Terrain(200,16,"Place Pigalle",Matignon, orange);
        cases.add(Pigalle);
        orange.proprietes.add((Terrain) Pigalle);
        Case stMichel = new Terrain(180,14,"Blvd St Michel",Pigalle, orange);
        cases.add(stMichel);
        orange.proprietes.add((Terrain) stMichel);
        Case mozart = new Terrain(180,14,"Avenue Mozart",stMichel, orange);
        cases.add(mozart);
        orange.proprietes.add((Terrain) mozart);
        Case GareLyon = new Gare(25, "Gare de Lyon", 200, mozart);
        Gares.add((Gare) GareLyon);
        cases.add(GareLyon);
        Case paradis = new Terrain(160,12,"rue de Paradis",GareLyon, rose);
        cases.add(paradis);
        rose.proprietes.add((Terrain) paradis);
        Case neuilly = new Terrain(140,10,"Avenue de Neuilly",paradis, rose);
        cases.add(neuilly);
        rose.proprietes.add((Terrain) neuilly);
        Case elec = new Service(150,10,"Compagnie electricité",neuilly);
        cases.add(elec);
        Case vilette = new Terrain(140,10,"Boulevard de la Vilette",elec, rose);
        cases.add(vilette);
        rose.proprietes.add((Terrain) vilette);
        Case republique = new Terrain(120,8,"Avenue de Republique",vilette, gris);
        cases.add(republique);
        gris.proprietes.add((Terrain) republique);
        Case courcelle = new Terrain(100,6,"Rue de courcelles",republique, gris);
        cases.add(courcelle);
        gris.proprietes.add((Terrain) courcelle);
        Case Vaugirard = new Terrain(100,6,"Rue de Vaugirard",courcelle, gris);
        cases.add(Vaugirard);
        gris.proprietes.add((Terrain) Vaugirard);
        Case GareMonparnasse = new Gare(25, "Gare Montparnasse", 200, Vaugirard);
        Gares.add((Gare) GareMonparnasse);
        cases.add(GareMonparnasse);
        Case lecourbe = new Terrain(60,4,"Rue Lecourbe",GareMonparnasse, marron);
        cases.add(lecourbe);
        marron.proprietes.add((Terrain) lecourbe);
        Case belleville = new Terrain(60,4,"Boulevard de Belleville",lecourbe, marron);
        cases.add(belleville);
        marron.proprietes.add((Terrain) belleville);
        start.setCaseSuivante(belleville);


        ((Gare) GareMonparnasse).Gares = Gares;
        ((Gare) GareLyon).Gares = Gares;
        ((Gare) GareSTLazare).Gares = Gares;
        ((Gare) GareNord).Gares = Gares;

        return cases;
    }
    
    public Case getPositionJoueur(int resultDes, Case caseDepart, Joueur joueur){
        for (int i = 0; i < resultDes; i++) {
            caseDepart = caseDepart.getCaseSuivante();
            //Debug Plateau
            //System.out.println(caseDepart.getName() + " " + i);
            if(caseDepart.getName() == "Start"){
                joueur.setSolde(joueur.getSolde() + 200);
                System.out.println(joueur.getNom() + " gagne 200 car il est passé par la case Départ, son solde est de " + joueur.getSolde());
            }
        }
        return caseDepart;
    }


    public ArrayList<Terrain> getTerrainConstructible(Joueur joueur) {
        ArrayList<Terrain> terrains = new ArrayList<Terrain>();
        for(Quartier quartier : quartiers){
            if(quartier.estConstructible() && (quartier.proprietes.get(0).getProprietaire() == joueur)){
                terrains.addAll(quartier.proprietes);
            }
        }
        return terrains;
    }
}