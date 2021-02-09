package EntrepriseCorp;

public abstract class Case {

    private String name;
    private Case caseSuivante;

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
}  