public class Vorlesungsstunde {
    // Datenfelder
    private String thema;
    private String datum;
    private String uhrzeit;
    private String raum;

    // Getter und Setter
    public String getThema() {
        return thema;
    }

    public void setThema(String thema) {
        this.thema = thema;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String getUhrzeit() {
        return uhrzeit;
    }

    public void setUhrzeit(String uhrzeit) {
        this.uhrzeit = uhrzeit;
    }

    public String getRaum() {
        return raum;
    }

    public void setRaum(String raum) {
        this.raum = raum;
    }

    // Methoden
    public void details() {
        System.out.println(thema);
        System.out.println(datum);
        System.out.println(uhrzeit);
        System.out.println(raum);
    }

    // Leerer Konstruktor
    public Vorlesungsstunde() {
    }

    // Standardkonstruktor
    public Vorlesungsstunde(String thema, String datum, String uhrzeit, String raum) {
        this.thema = thema;
        this.datum = datum;
        this.uhrzeit = uhrzeit;
        this.raum = raum;
    }
}
