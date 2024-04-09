public class Dozierender {
    // Datenfelder
    private String name;
    private String fakultaet;
    private String bueronummer;
    // Aufgabe 3
    private String[][] buerozeiten = { { "Montag", "Dienstag", "Mittwoch" },
            { "13.00-14.00", "12.30-14.00", "10.00-10-30" } };

    // Getter und Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFakultaet() {
        return fakultaet;
    }

    public void setFakultaet(String fakultaet) {
        this.fakultaet = fakultaet;
    }

    public String getBueronummer() {
        return bueronummer;
    }

    public void setBueronummer(String bueronummer) {
        this.bueronummer = bueronummer;
    }

    public String[][] getBuerozeiten() {
        return buerozeiten;
    }

    public void setBuerozeiten(String[][] buerozeiten) {
        this.buerozeiten = buerozeiten;
    }

    // Frage beantworten
    public String answerQuestion(Studierender studierender) {
        String frage = studierender.getFrage();
        System.out.println(frage);
        String antwort;
        antwort = Input.readString();
        return antwort;
    }

    public void feedback() {

        // Eingabe des Feedbacks
        System.out.println("Unterrichtsqualität bewerten von 1 bis 5");
        String antwort1 = Input.readString();
        System.out.println("generelle Stimmung bewerten von 1 bis 5");
        String antwort2 = Input.readString();
        System.out.println("Kompetenz des Dozierenden bewerten von 1 bis 5");
        String antwort3 = Input.readString();

        // Ausgabe des Feedbacks
        System.out.println("Unterrichtsqualität" + antwort1);
        System.out.println("generelle Stimmung" + antwort2);
        System.out.println("Kompetenz des Dozierenden" + antwort3);
    }
}