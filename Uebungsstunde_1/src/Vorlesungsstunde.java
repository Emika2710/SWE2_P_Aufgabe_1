public class Vorlesungsstunde {
    private String thema;
    private String datum;
    private String uhrzeit;
    private String raum;

    //Getter und Setter
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
    
    //Methoden
    public void details() {
        System.out.println(thema);
        System.out.println(datum);
        System.out.println(uhrzeit);
        System.out.println(raum);
    }
}
