package EntrepriseCorp.Cases;

public class Start extends Case {
    private int gain;

    public Start() {
        super("Start");
        this.gain = 200;
    }

    public int getGain() {
        return this.gain;
    }

    public void setGain(int gain) {
        this.gain = gain;
    }
}