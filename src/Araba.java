/**
 * Created by cezvedici on 05.03.2017.
 */
public class Araba {
    private String plaka;
    private Insan sahip;
    private double yakit;
    private double maxHiz;

    public Araba(String plaka, double maxHiz) {
        this.plaka = plaka;
        this.maxHiz = maxHiz;
    }

    public String getPlaka() {
        return plaka;
    }

    public double getMaxHiz() {
        return maxHiz;
    }

    public Insan getSahip() {
        return sahip;
    }

    public void setSahip(Insan sahip) {
        this.sahip = sahip;
    }

    public double getYakit() {
        return yakit;
    }

    public void setYakit(double yakit) {
        this.yakit = yakit;
    }
}
