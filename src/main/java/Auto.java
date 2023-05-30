public class Auto {
    private String tipus;
    private double fogyasztas;
    private boolean eladva;
    private String szin;
    private int ulesekSzama;

    public Auto(String tipus, double fogyasztas, boolean eladva, String szin, int ulesekSzama) {
        this.tipus = tipus;
        this.fogyasztas = fogyasztas;
        this.eladva = eladva;
        this.szin = szin;
        this.ulesekSzama = ulesekSzama;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public double getFogyasztas() {
        return fogyasztas;
    }

    public void setFogyasztas(double fogyasztas) {
        this.fogyasztas = fogyasztas;
    }

    public boolean isEladva() {
        return eladva;
    }

    public void setEladva(boolean eladva) {
        this.eladva = eladva;
    }

    public String getSzin() {
        return szin;
    }

    public void setSzin(String szin) {
        this.szin = szin;
    }

    public int getUlesekSzama() {
        return ulesekSzama;
    }

    public void setUlesekSzama(int ulesekSzama) {
        this.ulesekSzama = ulesekSzama;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "tipus='" + tipus + '\'' +
                ", fogyasztas=" + fogyasztas +
                ", eladva=" + eladva +
                ", szin='" + szin + '\'' +
                ", ulesekSzama=" + ulesekSzama +
                '}';
    }
}
