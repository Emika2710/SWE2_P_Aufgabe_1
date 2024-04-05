public class Studierender {
    private String name;
    private int matrikelnummer;
    private String studiengang;
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

    public void frageStellen(Dozierender professor) {

        System.out.println("Was ist die Frage?");
        String frage = Input.readString();

    }

    public void sprechstundenanfrage(Dozierender professor) {
        System.out.print("Betreff: ");
        String betreff = Input.readString();

        System.out.println("Zeit: ");
        String zeit = Input.readString();
    }
}
