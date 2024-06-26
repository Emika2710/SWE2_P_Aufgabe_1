public class Praktikumsstunde {
    // Datenfelder
    private String thema;
    private String datum;
    private String uhrzeit;
    private String raum;
    private String aufgaben;

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

    public String getAufgaben() {
        return aufgaben;
    }

    public void setAufgaben(String aufgaben) {
        this.aufgaben = aufgaben;
    }

    // Methode zur Ausgabe der Praktikumsdetails
    public void praktikumsstunde() {
        System.out.println(thema);
        System.out.println(datum);
        System.out.println(uhrzeit);
        System.out.println(raum);
        System.out.println(aufgaben);
    }
    //leerer Konstruktor
    public Praktikumsstunde (){

    }
    //Standardkonstruktor
    public Praktikumsstunde(String thema, String datum, String uhrzeit, String raum, String aufgaben) {
        this.thema = thema;
        this.datum = datum;
        this.uhrzeit = uhrzeit;
        this.raum = raum;
        this.aufgaben = aufgaben;
    }
}
