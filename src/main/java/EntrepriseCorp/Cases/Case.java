package EntrepriseCorp.Cases;

public abstract class Case {

    protected String name;
    protected Case caseSuivante;

    public Case() {

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
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
}  