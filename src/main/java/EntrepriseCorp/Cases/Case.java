package EntrepriseCorp.Cases;

import EntrepriseCorp.Cases.Etats.Etat;

public abstract class Case {

    protected String name;
    protected Case caseSuivante;
    protected Etat etat;

    public Case() {

    }

    public Case(String name, Case caseSuivante) {
        this.name = name;
        this.caseSuivante = caseSuivante;
    }
    public Case(String name){
        this.name = name;
    };

    public Case getCaseSuivante() {
        return caseSuivante;
    }

    public void setCaseSuivante(Case caseSuivante) {
        this.caseSuivante = caseSuivante;
    }

    public Etat getState() {
        return etat;
    }

    public void setState(Etat state) {
        this.etat = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}