package packagekeiko;

public class chingcheng {
    private double nilaitubes;
    private double nilaiquiz;
    private double nilaitugas;
    private double nilaiuts;
    private double nilaiuas;

    public chingcheng(double nilaitubes, double nilaiquiz, double nilaitugas, double nilaiuts, double nilaiuas) {
        this.nilaitubes = nilaitubes;
        this.nilaiquiz = nilaiquiz;
        this.nilaitugas = nilaitugas;
        this.nilaiuts = nilaiuts;
        this.nilaiuas = nilaiuas;
    }
    
    public double hitungtotalnilai() {
        return (0.30 * nilaitubes) + (0.10 * nilaiquiz) + (0.10 * nilaitugas) + (0.25 * nilaiuts) + (0.25 * nilaiuas);
    }


}
