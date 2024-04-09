public class Studierender {
    // Datenfelder
    private String name;
    private int matrikelnummer;
    private String studiengang;
    // Aufgabe 3.2
    private String frage;

    // Konstruktor
    public Studierender(String name, int matrikelnummer, String studiengang) {
        this.name = name;
        this.matrikelnummer = matrikelnummer;
        this.studiengang = studiengang;
    }

    // Getter und Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMatrikelnummer() {
        return matrikelnummer;
    }

    public void setMatrikelnummer(int matrikelnummer) {
        this.matrikelnummer = matrikelnummer;
    }

    public String getStudiengang() {
        return studiengang;
    }

    public void setStudiengang(String studiengang) {
        this.studiengang = studiengang;
    }

    public String getFrage() {
        return frage;
    }

    // Frage stellen
    public void frageStellen(Dozierender professor) {

        System.out.println("Was ist die Frage?");
        this.frage = Input.readString();

    }

    // Sprechstundenanfrage
    public void sprechstundenanfrage(Dozierender professor) {
        System.out.print("Betreff: ");
        String betreff = Input.readString();

        System.out.println("Spechstunden: ");
        String[][] buerozeiten = professor.getBuerozeiten();
        for (int i = 0; i < 3; i++) {
            System.out.print(buerozeiten[0][i] + buerozeiten[1][i]);
        }

        System.out.println();

        System.out.println("Zeit: ");
        String zeit = Input.readString();
    }
}
