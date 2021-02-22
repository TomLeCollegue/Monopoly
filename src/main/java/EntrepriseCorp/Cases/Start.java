package EntrepriseCorp.Cases;

import EntrepriseCorp.Cases.Etats.EtatCaseStart;

public class Start extends Case {
    private int gain;

    public Start(String name) {
        super("Start");
        etat = new EtatCaseStart(this);
    }


}