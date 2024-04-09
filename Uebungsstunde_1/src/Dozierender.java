public class Dozierender {
    // Datenfelder
    private String name;
    private String fakultaet;
    private String bueronummer;
    // Aufgabe 3
    private String[][] buerozeiten = { { "Montag", "Dienstag", "Mittwoch" },
            { "13.00-14.00", "12.30-14.00", "10.00-10-30" } };

    // Konstruktor
    public Dozierender(String name, String fakultät, String bueronummer) {
        this.name = name;
        this.fakultaet = fakultät;
        this.bueronummer = bueronummer;
    }

    public Dozierender() {

    }

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
        System.out.println("Bitte geben Sie die Antwort zur Frage ein");
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

    // Rings um Lehrveranstaltungen
    public void studentAusVeranstaltungEntfernen(Lehrveranstaltung veranstaltung, Studierender student) {
        veranstaltung.studentEntfernen(student);
    }

    public void VorlesungsstundePlanen(Lehrveranstaltung kurs) {

        Vorlesungsstunde stunde = new Vorlesungsstunde();

        System.out.print("Das Thema: ");
        stunde.setThema(Input.readString());
        System.out.print("Das Datum: ");
        stunde.setDatum(Input.readString());
        System.out.print("Die Uhrzeit:");
        stunde.setUhrzeit(Input.readString());
        System.out.print("Der Raum: ");
        stunde.setRaum(Input.readString());

        kurs.setVorlesungsstunden(stunde);
    }

    public void PraktikumsstundePlanen(Lehrveranstaltung kurs) {
        Praktikumsstunde stunde = new Praktikumsstunde();

        System.out.print("Das Thema: ");
        stunde.setThema(Input.readString());
        System.out.print("Das Datum: ");
        stunde.setDatum(Input.readString());
        System.out.print("Die Uhrzeit:");
        stunde.setUhrzeit(Input.readString());
        System.out.print("Der Raum: ");
        stunde.setRaum(Input.readString());
        System.out.print("Die Aufgabe: ");
        stunde.setAufgaben(Input.readString());

        kurs.setPraktikumsstunden(stunde);
    }
}